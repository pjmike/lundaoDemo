package com.pjmike.lundao.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
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
	public ThesisExtend selectBythesisId(int id) throws Exception,ClassCastException {
		return thesisServiceImpl.selectBythesisId(id);
		
	}
	
	/**
	 * 
	 * @param request
	 * 做增添论点的功能
	 */
	@RequestMapping("/insertthesis")
	public void insertthesis(HttpServletRequest request) {
		Thesis thesis = new Thesis();
		thesis.settDescription(request.getParameter("title"));
		thesis.settState(request.getParameter("content"));
		thesisServiceImpl.insert(thesis);
	}
	
}
