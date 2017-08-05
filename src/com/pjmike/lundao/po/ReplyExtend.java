package com.pjmike.lundao.po;

import java.util.List;

public class ReplyExtend extends Reply{
	private List<ReplyExtend> nextReply;

	public List<ReplyExtend> getNextReply() {
		return nextReply;
	}

	public void setNextReply(List<ReplyExtend> nextReply) {
		this.nextReply = nextReply;
	}
	
}
