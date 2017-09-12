package com.pjmike.lundao.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Producer;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/askquestion")
public class AskquesController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	@Autowired
	Producer producer;
	@Autowired
	UserServiceImpl userServiceImpl;
	/**
	 * 
	 * @param request
	 * 发起提问及异议
	 * @throws IOException 
	 */
	@RequestMapping("/insertAskquestion")
	public ModelAndView insertAskquestion(HttpServletRequest request) throws IOException {
		
		
//		String str = URLDecoder.decode(request.getParameter("object"),"UTF-8"); 
		
		JSONObject jb=JsonRead.receivePost(request);
		int thesisId = jb.getInt("thesisId");
		String describtion = jb.getString("describtion");
		String content = jb.getString("content");
		int fromUid = jb.getInt("fromUid");
		int type = jb.getInt("type");
		Askquestion ask = new Askquestion();
		ask.setThesisId(thesisId);
		ask.setContent(content);
		ask.setFromUid(fromUid);
		ask.setDescribtion(describtion);
		ask.setType(type);
		askquesServiceImpl.insertaskquestion(ask);
		return null;
	}
	@RequestMapping("/deleteAskquestion")
	public ModelAndView deleteAskquestion(HttpServletRequest request) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		int askid = json.getInt("askid");
		askquesServiceImpl.changeIsShow(id, askid);
		return null;
	}
}
