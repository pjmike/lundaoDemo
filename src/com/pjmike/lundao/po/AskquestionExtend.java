package com.pjmike.lundao.po;

import java.util.List;

public class AskquestionExtend extends Askquestion{
	private List<ReplyExtend> replies;

	public List<ReplyExtend> getReplies() {
		return replies;
	}

	public void setReplies(List<ReplyExtend> replies) {
		this.replies = replies;
	}
}
