package com.pjmike.lundao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.tool.MessageProducerServiceImp;

public class Test {
	private MessageProducerServiceImp  messageProducerServiceImp;
	@Before
	public void before() {
	 	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");  
	 	messageProducerServiceImp = (MessageProducerServiceImp) ac.getBean("iMessageProducer");  
	}
	@RequestMapping("/sendRabbitMessage")
	@ResponseBody
	@org.junit.Test
	public void test() {
		    User user = new User();
		    user.setNickname("lidong");
		    user.setAge(25);
		    user.setPassword("123456");
		    user.setId(12);
		    messageProducerServiceImp.sendMessage(user);
	}
}
