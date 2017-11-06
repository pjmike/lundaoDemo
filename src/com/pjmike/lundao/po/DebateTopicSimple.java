package com.pjmike.lundao.po;

import java.util.Date;

public class DebateTopicSimple {
		private int topicId;
		public int getTopicId() {
			return topicId;
		}
		public void setTopicId(int topicId) {
			this.topicId = topicId;
		}
		private String describtion;
	    private Integer like;
	    private Integer attention;
	    private Date publishTime;
	    private String content;
	   
		
		public String getDescribtion() {
			return describtion;
		}
		public void setDescribtion(String describtion) {
			this.describtion = describtion;
		}
		public Integer getLike() {
			return like;
		}
		public void setLike(Integer like) {
			this.like = like;
		}
		public Integer getAttention() {
			return attention;
		}
		public void setAttention(Integer attention) {
			this.attention = attention;
		}
		public Date getPublishTime() {
			return publishTime;
		}
		public void setPublishTime(Date publishTime) {
			this.publishTime = publishTime;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
}
