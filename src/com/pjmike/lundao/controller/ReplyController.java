package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mchange.v3.filecache.RelativePathFileCacheKey;
import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.GetUseridServiceImpl;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import com.pjmike.lundao.service.Impl.ReplyServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Action;
import com.pjmike.lundao.util.Producer;
import com.pjmike.lundao.util.TargetType;

import net.sf.json.JSONObject;

/**回复的controller
 * @author pjmike
 *	
 */
@Controller
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	ReplyServiceImpl replyServiceImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	NotifyServiceImpl notifyServiceImpl;
	@Autowired
	GetUseridServiceImpl getUseridServiceImpl;
	/**
	 * 回复
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/insertreply")
	public ModelAndView reply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int commentId = json.getInt("commentId");
		int replyId = json.getInt("replyId");
		int fromUid = json.getInt("fromUid");
		int toUid = json.getInt("toUid");
		String rDescribtion = json.getString("rDescribtion");
		Reply reply = new Reply();
		reply.setCommentId(commentId);
		reply.setFromUid(fromUid);
		reply.setrDescribtion(rDescribtion);
		reply.setToUid(toUid);
		reply.setReplyId(replyId);
		replyServiceImpl.reply(reply);
		//向某个提问或异议添加回复提醒
		notifyServiceImpl.createRemind(commentId, TargetType.AKSQUESTION, Action.COMMENT, fromUid,rDescribtion);
		
		return null;
	}
	/**
	 * 删除回复
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/deleteReply")
	public ModelAndView deleteReply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int replyid = json.getInt("replyid");
		int userid = json.getInt("userid");
		replyServiceImpl.changereplyIsShow(userid, replyid);
		return null;
	}
	/**
	 * 点赞某个回复
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/likeReply")
	public ModelAndView likeReply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int replyid = json.getInt("replyid");
		int userid = json.getInt("userid");
		boolean islike = json.getBoolean("islike");
		int count = replyServiceImpl.selectLike(userid, replyid);
		int fromUid = getUseridServiceImpl.getUserIdOfReply(replyid);
		if (count == 0) {
			replyServiceImpl.insetLike(userid, replyid);
			//创建点赞信息表
			notifyServiceImpl.createInformation(replyid, TargetType.REPLY, Action.LIKE, userid,fromUid);
		} 
		if (count == 1) {
			if (islike) {
				replyServiceImpl.AgainLike(userid, replyid);
			} else {
				replyServiceImpl.giveupLike(userid, replyid);
			}
		}
		return null;
	}
	
}
