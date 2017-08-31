package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class MyAttentionController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	@RequestMapping(value="/AttentionAskquestion",method=RequestMethod.GET)
	@ResponseBody
	public List<AskquAttention> AttentionAskquestion(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		return askquesServiceImpl.selecrAllAttentionAskqustion(id);
	}
}
