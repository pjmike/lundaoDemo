package com.pjmike.lundao.po;

public class AskquestionVo {
	/**
	 * 获取提问或异议列表
	 */
	private AskquestionExtend askquestionExtend;
	/**
	 * 评论者
	 */
	private User user;
	public AskquestionExtend getAskquestionExtend() {
		return askquestionExtend;
	}
	public void setAskquestionExtend(AskquestionExtend askquestionExtend) {
		this.askquestionExtend = askquestionExtend;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
