package com.pjmike.lundao.po;

import java.util.List;

public class AskExtend extends Ask{
	private Askcondition askcondition;
	private List<Replyask> replyask;
	public Askcondition getAskcondition() {
		return askcondition;
	}
	
	public void setAskcondition(Askcondition askcondition) {
		this.askcondition = askcondition;
	}

	public List<Replyask> getReplyask() {
		return replyask;
	}

	public void setReplyask(List<Replyask> replyask) {
		this.replyask = replyask;
	}

	
	
}
