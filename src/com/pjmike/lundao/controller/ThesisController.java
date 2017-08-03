package com.pjmike.lundao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;

@Controller
public class ThesisController {
	@Autowired
	DebateServiceImpl debateServiceImpl;
	
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@RequestMapping("/thesisbyid")
	@ResponseBody
	public ThesisExtend selectBythesisId(int id) {
		return thesisServiceImpl.selectBythesisId(id);
		
	}
}
