package com.pjmike.lundao.po;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReplyExtend extends Reply{
	private String nickname ="";
	
	private boolean isLeftScroll=true;
	
	private boolean isRightScroll=true;
	
	private boolean isShow = true;
	
	private boolean dislike = false;
	

	@JsonGetter("dislike")
	public boolean Dislike() {
		return dislike;
	}

	public void setDislike(boolean dislike) {
		this.dislike = dislike;
	}

	@JsonGetter("isShow")
	public boolean getShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

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
	private List<ReplyExtend> nextReply;
	@JsonIgnore
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
