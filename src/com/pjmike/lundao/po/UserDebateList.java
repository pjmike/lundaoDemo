package com.pjmike.lundao.po;

public class UserDebateList {
	private int debateId;
	private String debateName;
	private String debateText;
	public int getDebateId() {
		return debateId;
	}
	public void setDebateId(int debateId) {
		this.debateId = debateId;
	}
	public String getDebateName() {
		return debateName;
	}
	public void setDebateName(String debateName) {
		this.debateName = debateName;
	}
	public String getDebateText() {
		return debateText;
	}
	public void setDebateText(String debateText) {
		this.debateText = debateText;
	}
	@Override
	public String toString() {
		return "UserDebateList [debateId=" + debateId + ", debateName=" + debateName + ", debateText=" + debateText
				+ "]";
	}
	
}
