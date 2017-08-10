package com.pjmike.lundao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;

@Controller
public class AskquesController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	/**
	 * 
	 * @param request
	 * 发起提问及异议
	 */
	@RequestMapping("/insertAskquestion")
	public void insertAskquestion(HttpServletRequest request) {
		Askquestion askquestion = new Askquestion();
		askquesServiceImpl.insertaskquestion(askquestion);
	}
}
