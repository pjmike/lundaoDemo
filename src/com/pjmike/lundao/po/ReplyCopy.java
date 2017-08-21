package com.pjmike.lundao.po;

import java.util.List;

public class ReplyCopy extends Reply{
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

	private List<ReplyCopy> nextReply;
	private ReplyCopy replyExtend;
	public ReplyCopy getReplyExtend() {
		return replyExtend;
	}

	public void setReplyExtend(ReplyCopy replyExtend) {
		this.replyExtend = replyExtend;
	}

	public List<ReplyCopy> getNextReply() {
		return nextReply;
	}

	public void setNextReply(List<ReplyCopy> nextReply) {
		this.nextReply = nextReply;
	}
	
}
