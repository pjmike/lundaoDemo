package com.pjmike.lundao.po;

import java.util.List;

public class ThesisExtend extends Thesis{
	private List<AskquestionExtend> askquestions;

	public List<AskquestionExtend> getAskquestions() {
		return askquestions;
	}

	public void setAskquestions(List<AskquestionExtend> askquestions) {
		this.askquestions = askquestions;
	}
	
}

