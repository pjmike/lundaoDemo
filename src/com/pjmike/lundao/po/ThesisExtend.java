package com.pjmike.lundao.po;

import java.util.List;

public class ThesisExtend extends Thesis{
	private List<Ask> asks ;
	public List<Ask> getAsks() {
		return asks;
	}
	public void setAsks(List<Ask> asks) {
		this.asks = asks;
	}
	private List<Question> questions;
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
