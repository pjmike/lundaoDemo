package com.pjmike.lundao.po;

import java.util.List;

public class ReplyExtend extends Reply{
	private String nickname ="";
	
	private boolean isLeftScroll=false;
	
	private boolean isRightScroll=false;
	
	public boolean isLeftScroll() {
		return isLeftScroll;
	}

	public void setLeftScroll(boolean isLeftScroll) {
		this.isLeftScroll = isLeftScroll;
	}

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
