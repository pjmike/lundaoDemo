package com.pjmike.lundao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.service.Impl.ReplyServiceImpl;
import com.pjmike.lundao.util.Producer;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	ReplyServiceImpl replyServiceImpl;
	
	@RequestMapping("/insertreply")
	public void reply(@RequestBody Reply reply,HttpServletRequest request) {
		replyServiceImpl.reply(reply);
		
	}
	
}
