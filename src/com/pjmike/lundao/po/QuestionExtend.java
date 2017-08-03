package com.pjmike.lundao.po;

import java.util.List;

public class QuestionExtend extends Question{
	private Quescondition quescondition;
	private List<Replyquestion> replyquestion;
	public Quescondition getQuescondition() {
		return quescondition;
	}
	public void setQuescondition(Quescondition quescondition) {
		this.quescondition = quescondition;
	}
	public List<Replyquestion> getReplyquestion() {
		return replyquestion;
	}
	public void setReplyquestion(List<Replyquestion> replyquestion) {
		this.replyquestion = replyquestion;
	}
}
