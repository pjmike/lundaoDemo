package com.pjmike.lundao.po;

import java.util.List;

public class ReplyExtend extends Reply{
	private String nickname ="";
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
