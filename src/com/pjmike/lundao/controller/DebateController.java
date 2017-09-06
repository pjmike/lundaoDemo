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
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSON;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/debate")
public class DebateController {
	@Autowired
	private DebateServiceImpl debateServiceImpl;
	/*
	 * 按主键查找辩题，返回json辩题
	 */
	
	@RequestMapping("/findbyId")
	public  @ResponseBody Debatetopicextend debateFindbyId(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		User user = new User();
		user.setId(userid);
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
		int userid = json.getInt("id");
		int currPage = json.getInt("currPage");
		int pageSize = json.getInt("pageSize");
		User user =null;
		if(userid >0) {
			user = new User();
			user.setId(userid);
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
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		boolean statusLike = json.getBoolean("islike");
		Integer islike = debateServiceImpl.Islike(topicId, userid);
		if(islike != null) {
			if(statusLike) {
				debateServiceImpl.Likeagain(topicId, userid);
				
			} else {
				debateServiceImpl.giveupLike(topicId, userid);
			}
		} else {
			
			if(statusLike) {
				debateServiceImpl.insetLike(topicId, userid);
				
			} else {
				debateServiceImpl.giveupLike(topicId, userid);
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
		
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		boolean isAttention = json.getBoolean("isAttention");
		Integer Attention = debateServiceImpl.IsAttention(topicId, userid);
		if(Attention != null) {
			if(isAttention) {
				debateServiceImpl.Attentionagain(topicId, userid);
			} else {
				debateServiceImpl.deleteAttention(topicId, userid);
			}
		} else {
			if(isAttention) {
				debateServiceImpl.insertAttention(topicId, userid);
			} else {
				debateServiceImpl.deleteAttention(topicId, userid);
			}
		}
		return null;
	}
}
