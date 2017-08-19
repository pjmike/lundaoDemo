package com.pjmike.lundao.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;


@Controller
public class DebateController {
	@Autowired
	private DebateServiceImpl debateServiceImpl;
	
	/*
	 * 按主键查找辩题，返回json辩题
	 */
	@RequestMapping("/debateFindbyId")
	public  @ResponseBody Debatetopicextend debateFindbyId(HttpServletRequest request, int id,Debatetopicextend debatetopic) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		debatetopic = debateServiceImpl.selectByPrimaryKey(id,user);
		session.setAttribute("debatetopic", debatetopic);
		return debatetopic;
	}
	/*
	 * 
	 * 获取全部辩题不含论点
	 */
	
	@RequestMapping("/debateby")
	public  @ResponseBody List<Debatetopic> debateby(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<Debatetopic> DebatetopicList = new ArrayList<>();
		
			DebatetopicList = debateServiceImpl.selectListby(user);
		return DebatetopicList;
	}
	
	
	/*
	 * 
	 *点赞操作
	 */
	@RequestMapping("/updateVote")
	public void updateVote(HttpServletRequest request, int topicid) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//首先查找该辩题
		Debatetopicextend debatetopic = debateServiceImpl.selectByPrimaryKey(topicid,user);
		if(debatetopic != null && user !=null) {
			int vote = debatetopic.getLike();
			debatetopic.setLike(vote+1);
			debateServiceImpl.insetLike(topicid, user);
		}
	}
	/*
	 * 取消点赞
	 */
	@RequestMapping("/deleteLike")
	public void deleteLike(HttpServletRequest request, int topicid) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//首先查找该辩题
		Debatetopicextend debatetopic = debateServiceImpl.selectByPrimaryKey(topicid,user);
		if(debatetopic != null && user !=null) {
			int vote = debatetopic.getLike();
			debatetopic.setLike(vote-1);
			debateServiceImpl.giveupLike(topicid, user);
		}
	}
	/**
	 * 
	 * 更新辩题的点击量
	 */
	@RequestMapping("/updateClick")
	public void updateClick(HttpServletRequest request,int topicId) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//首先查找该辩题
		Debatetopic debatetopic = debateServiceImpl.selectByPrimaryKey(topicId,user);
		if(debatetopic != null) {
			int vote = debatetopic.getClickcount();
			debatetopic.setAttention(vote+1);
			debateServiceImpl.updateClick(debatetopic);
		}
	}
	/**
	 * 点击关注
	 */
	@RequestMapping("updateAttention")
	public void updateAttention(HttpServletRequest request,int topicId) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//首先查找该辩题
		Debatetopic debatetopic = debateServiceImpl.selectByPrimaryKey(topicId,user);
		if(debatetopic != null && user !=null) {
			
			debateServiceImpl.insertAttention(topicId, user);
		}
	}
	/**
	 * 取消关注
	 */
	@RequestMapping("deleteAttention")
	public void deleteAttention(HttpServletRequest request,int topicId) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//首先查找该辩题
		Debatetopic debatetopic = debateServiceImpl.selectByPrimaryKey(topicId,user);
		if(debatetopic != null && user !=null) {
			
			debateServiceImpl.deleteAttention(topicId, user);
		}
	}
	/**
	 * test
	 */
	@RequestMapping("/testController")
	public void test(HttpServletRequest request) {
		System.out.println("get it");
	}
}
