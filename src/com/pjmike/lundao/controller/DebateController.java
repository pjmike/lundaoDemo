package com.pjmike.lundao.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Action;
import com.pjmike.lundao.util.TargetType;

import net.sf.json.JSON;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/debate")
public class DebateController {
	@Autowired
	private DebateServiceImpl debateServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private NotifyServiceImpl notifyServiceImpl;
	/*
	 * 按主键查找辩题，返回json辩题
	 */
	
	@RequestMapping("/findbyId")
	public  @ResponseBody Debatetopicextend debateFindbyId(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		int topicId = json.getInt("topicId");
		User user = null;
		if(id>0) {
			user = new User();
			user.setId(id);
		}
		Debatetopicextend debatetopic = debateServiceImpl.selectByPrimaryKey(topicId,user);
		return debatetopic;
	}
	
	/*
	 * 
	 * 获取全部辩题不含论点
	 */
	
	@RequestMapping("/alldebateByPage")
	public  @ResponseBody List<Debatetopic> debateby(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int currPage = json.getInt("currPage");
		int pageSize = json.getInt("pageSize");
		int id = json.getInt("id");
		User user =null;
		if(id > 0 ) {
			user = new User();
			user.setId(id);
		}
	
		
		List<Debatetopic> DebatetopicList = new ArrayList<>();
		
		DebatetopicList = debateServiceImpl.selectListByPage(user, currPage, pageSize);
		return DebatetopicList;
	}
	/*
	 * 
	 *点赞操作
	 */
	@RequestMapping("/updateVote")
	public ModelAndView updateVote(HttpServletRequest request) throws UnsupportedEncodingException, IOException {
		JSONObject json = JsonRead.receivePost(request);
		int topicId = json.getInt("topicId");
		boolean statusLike = json.getBoolean("islike");
		int id = json.getInt("id");
	
		Integer islike = debateServiceImpl.Islike(topicId, id);
		if(islike != null) {
			if(statusLike) {
				debateServiceImpl.Likeagain(topicId, id);
				
			} else {
				debateServiceImpl.giveupLike(topicId, id);
			}
		} else {
			
			if(statusLike) {
				debateServiceImpl.insetLike(topicId, id);
				
			} else {
				debateServiceImpl.giveupLike(topicId, id);
			}
		}
		return null;
		
	}

	/**
	 * 点击关注
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/updateAttention")
	public ModelAndView updateAttention(HttpServletRequest request) throws UnsupportedEncodingException, IOException {
		JSONObject json = JsonRead.receivePost(request);
		
		int id = json.getInt("id");
		int topicId = json.getInt("topicId");
		boolean isAttention = json.getBoolean("isAttention");
		Integer Attention = debateServiceImpl.IsAttention(topicId, id);
		if(Attention != null) {
			if(isAttention) {
				debateServiceImpl.Attentionagain(topicId, id);
			} else {
				debateServiceImpl.deleteAttention(topicId, id);
			}
		} else {
			if(isAttention) {
				debateServiceImpl.insertAttention(topicId, id);
				notifyServiceImpl.subscribe(id, topicId,TargetType.DEBATETOPIC, Action.ATTENTION);
			} else {	
				debateServiceImpl.deleteAttention(topicId, id);
			}
		}
		return null;
	}
}
