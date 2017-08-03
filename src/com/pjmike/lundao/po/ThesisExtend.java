package com.pjmike.lundao.po;

import java.util.List;

public class ThesisExtend extends Thesis{
	private List<AskExtend> asks ;
	private List<QuestionExtend> questions;
	
	
	
	
	public List<AskExtend> getAsks() {
		return asks;
	}
	public void setAsks(List<AskExtend> asks) {
		this.asks = asks;
	}
	public List<QuestionExtend> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionExtend> questions) {
		this.questions = questions;
	}
}

