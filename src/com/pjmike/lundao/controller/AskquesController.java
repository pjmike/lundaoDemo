package com.pjmike.lundao.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.util.Producer;

import net.sf.json.JSONObject;

@Controller
public class AskquesController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	@Autowired
	Producer producer;
	/**
	 * 
	 * @param request
	 * 发起提问及异议
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/insertAskquestion")
	public void insertAskquestion(@RequestBody Askquestion askquestion,HttpServletRequest request) throws UnsupportedEncodingException {
		
		String str = URLDecoder.decode(request.getParameter("object"),"UTF-8"); 
		JSONObject jb=new JSONObject();
		String content = jb.fromObject(str).getString("content");

		
		producer.sendmessage(askquestion);

		askquesServiceImpl.insertaskquestion(askquestion);
	}
}
