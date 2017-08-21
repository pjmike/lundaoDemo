package com.pjmike.lundao.websocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

@SuppressWarnings("deprecation")
@ServerEndpoint("/webSocket")
public class WebSocketServer {
	//静态变量，用来记录当前在线连接数的
	private static int onlineCount = 0;
	private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<WebSocketServer>();
	private Session session;
	
	@SuppressWarnings("deprecation")
	@OnOpen
	public void onOpen(Session sesison) {
		this.session = session;
		webSocketSet.add(this);
		onlineCount++;
		System.out.println("有新用户接入:当前在线人数"+onlineCount);
		String QUEUE_NAME = "queue_one";
		try {
			 ConnectionFactory factory = new ConnectionFactory();
	            //设置MabbitMQ所在主机ip或者主机名
	            factory.setHost("47.94.89.241");
	            factory.setPort(5672);
	            factory.setUsername("pj");
	            factory.setPassword("root");
	            
	            Connection connection = factory.newConnection();
	            Channel channel = connection.createChannel();
	            //声明队列，主要为了防止消息接收者先运行此程序，队列还不存在时创建队列。
	            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
	            System.out.println("Waiting for messages. To exit press CTRL+C");
	            //创建队列消费者
	            QueueingConsumer consumer = new QueueingConsumer(channel);
	            //指定消费队列
	            channel.basicConsume(QUEUE_NAME, true, consumer);
	            while (true) {
	                //nextDelivery是一个阻塞方法（内部实现其实是阻塞队列的take方法）
	                QueueingConsumer.Delivery delivery = consumer.nextDelivery();
	                String message = new String(delivery.getBody());
	                System.out.println("Received '" + message + "'");
	                sendMessage(message);
	            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@OnClose
	public void onClose(){ 
		webSocketSet.remove(this); //从set中删除 
		onlineCount--; //在线数减1 
		System.out.println("有一连接关闭！当前在线人数为" + onlineCount); 
	}
	@OnMessage
	public void onMessage(String message, Session session) {
        System.out.println("来自客户端的消息:" + message);
        //群发消息
        for(WebSocketServer item: webSocketSet){
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
	 public void sendMessage(String message) throws IOException{
	        this.session.getBasicRemote().sendText(message);
	        //this.session.getAsyncRemote().sendText(message);
	    }
}
