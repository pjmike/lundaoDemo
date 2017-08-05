package com.pjmike.lundao.po;

import java.util.List;

public class AskquestionExtend extends Askquestion{
	private List<Reply> replies;

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
}
