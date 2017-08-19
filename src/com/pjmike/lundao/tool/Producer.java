package com.pjmike.lundao.tool;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
@Service
public class Producer {
	 // 注入生产者实例
	 @Resource(name="amqpTemplate")
	 private RabbitTemplate template;
	 // 发送消息。第一个参数是路由键值， 第二个参数是具体的消息
	 public void sendmessage(Object message){
		 template.convertAndSend("queue_one_key","Hello!");
	 }
}
