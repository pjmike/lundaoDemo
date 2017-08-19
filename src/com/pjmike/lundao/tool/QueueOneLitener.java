package com.pjmike.lundao.tool;

import org.springframework.amqp.core.Message;

public class QueueOneLitener implements MessageListener{
	 @Override
     public void onMessage(Message message) {
          System.out.println(" data get by sender:" + new String(message.getBody()));
    }
}
