package com.pjmike.lundao.po;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReplyExtend extends Reply{
	private String nickname ="";
	
	private boolean isLeftScroll=false;
	
	private boolean isRightScroll=false;
	
	@JsonGetter("isLeftScroll")
	public boolean isLeftScroll() {
		return isLeftScroll;
	}

	public void setLeftScroll(boolean isLeftScroll) {
		this.isLeftScroll = isLeftScroll;
	}
	
	
	@JsonGetter("isRightScroll")
	public boolean RightScroll() {
		return isRightScroll;
	}

	public void setRightScroll(boolean isRightScroll) {
		this.isRightScroll = isRightScroll;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@JsonIgnore
	private List<ReplyExtend> nextReply;
	private ReplyExtend replyExtend;
	public ReplyExtend getReplyExtend() {
		return replyExtend;
	}

	public void setReplyExtend(ReplyExtend replyExtend) {
		this.replyExtend = replyExtend;
	}

	public List<ReplyExtend> getNextReply() {
		return nextReply;
	}

	public void setNextReply(List<ReplyExtend> nextReply) {
		this.nextReply = nextReply;
	}
	
}
