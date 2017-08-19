package com.pjmike.lundao.tool;

import org.springframework.amqp.core.Message;

public interface MessageListener {
	public void onMessage(Message message);
}
