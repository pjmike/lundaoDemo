package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.ReplyServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Producer;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	ReplyServiceImpl replyServiceImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
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
		return null;
	}
	@RequestMapping("/deleteReply")
	public ModelAndView deleteReply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int replyid = json.getInt("replyid");
		int userid = json.getInt("userid");
		replyServiceImpl.changereplyIsShow(userid, replyid);
		return null;
	}
	
}
