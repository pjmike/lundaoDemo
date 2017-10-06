package com.pjmike.lundao.po;

import java.util.List;

public class MyAttentionData {
	List<AskquAttention> askquestions ;
	List<DebateAndThesis> debateAndThesis;
	List<User> AttentionPeople;
	public List<User> getAttentionPeople() {
		return AttentionPeople;
	}
	public void setAttentionPeople(List<User> attentionPeople) {
		AttentionPeople = attentionPeople;
	}
	public List<AskquAttention> getAskquestions() {
		return askquestions;
	}
	public void setAskquestions(List<AskquAttention> askquestions) {
		this.askquestions = askquestions;
	}
	public List<DebateAndThesis> getDebateAndThesis() {
		return debateAndThesis;
	}
	public void setDebateAndThesis(List<DebateAndThesis> debateAndThesis) {
		this.debateAndThesis = debateAndThesis;
	}
}
