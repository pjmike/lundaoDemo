package com.pjmike.lundao.util;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Producer {
	 // 注入生产者实例
	/* @Autowired
	 private RabbitTemplate amqpTemplate;*/
	 // 发送消息。第一个参数是路由键值， 第二个参数是具体的消息
	/* public void sendmessage(Object message){
		 System.out.println("AAAAAA");
		 amqpTemplate.convertAndSend(message);
	 }*/
}
