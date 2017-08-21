package com.pjmike.lundao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.util.Producer;
@Controller
public class TestController {
	@Autowired
	private Producer producer;
	@RequestMapping("/sendRabbitMessage")
	@ResponseBody
	public void test() {
		    User user = new User();
		    user.setNickname("lidong");
		    user.setAge(25);
		    user.setPassword("123456");
		    user.setId(12);
		    producer.sendmessage(user);
		    
	}
}
