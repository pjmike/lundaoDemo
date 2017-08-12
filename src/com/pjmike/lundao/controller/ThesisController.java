package com.pjmike.lundao.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl2;

/**
 * @author DELL
 * 对论点的操作
 *
 */
@Controller
public class ThesisController {
	
	
	@Autowired
	DebateServiceImpl debateServiceImpl;
	
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@Autowired
	ThesisServiceImpl2 thesisServiceImpl2;
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/thesisbyid")
	@ResponseBody
	public ThesisExtend selectBythesisId(int id,HttpServletRequest request) throws Exception,ClassCastException {
		
		HttpSession session = request.getSession();
		User user  = (User) session.getAttribute("user");
		return thesisServiceImpl.selectBythesisId(id,user);
		
	}
	/**
	 * 查询某一具体论点的简介与题目
	 * @param id
	 * @return
	 */
	@RequestMapping("/oneThesis")
	@ResponseBody
	public Thesis oneThesis(int id) {
		return thesisServiceImpl.selectOne(id);
	}
	
	/**
	 * 
	 * @param request
	 * 做增添论点的功能
	 */
	@RequestMapping("/insertthesis")
	public void insertthesis(@RequestBody Thesis thesis,HttpServletRequest request) {
		/*Thesis thesis = new Thesis();
		thesis.settDescription(request.getParameter("title"));
		thesis.settState(request.getParameter("content"));
		User user = new User();
		
		thesis.setTfromuid(user.getId());*/
		
		
		thesisServiceImpl.insert(thesis);
	}
	/**
	 * 关注辩题
	 */
	@RequestMapping("/thesisAttention")
	public void thesisAttention(HttpServletRequest request,int thesisid) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Thesis thesis = thesisServiceImpl.selectOne(thesisid);
		if(thesis != null && user !=null) {
			thesisServiceImpl.insertAttention(thesisid, user);
		}
	}
	/**
	 * 取消关注辩题
	 */
	@RequestMapping("/giveupAttention")
	public void giveupAttention(HttpServletRequest request,int thesisid) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Thesis thesis = thesisServiceImpl.selectOne(thesisid);
		if(thesis != null && user !=null) {
			thesisServiceImpl.deleteAttention(thesisid, user);
		}
	}
}
