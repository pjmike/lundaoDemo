package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.ReplyServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Producer;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	ReplyServiceImpl replyServiceImpl;
	
	@RequestMapping("/insertreply")
	public void reply(@RequestBody Reply reply,HttpServletRequest request) {
		replyServiceImpl.reply(reply);
		
	}
	@RequestMapping("/deleteReply")
	public void deleteReply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("userid");
		int replyid = json.getInt("replyid");
		User user = null;
		if(userid >0) {
			user = new User();
			user.setId(userid);
		}
		replyServiceImpl.changereplyIsShow(userid, replyid);
	}
	
}
