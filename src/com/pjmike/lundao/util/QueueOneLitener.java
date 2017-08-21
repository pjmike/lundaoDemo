package com.pjmike.lundao.util;

import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;
@Service
public class QueueOneLitener implements MessageListener{
	 private CountDownLatch latch = new CountDownLatch(1);
	 @Override
     public void onMessage(Message message) {
		 
          System.out.println("AAAAAA-----------------AAAAAAAAAAAAAAA------------AAAAAAAAAAAAAAAAAAA:" + new String(message.getBody()));
          latch.countDown();
    }
}
