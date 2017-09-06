package com.pjmike.lundao.po;

public class DebateAndThesis {
	private int id;
	private int btState;
	private String title;
	private String contentSummary;
	private int viewNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBtState() {
		return btState;
	}
	public void setBtState(int btState) {
		this.btState = btState;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentSummary() {
		return contentSummary;
	}
	public void setContentSummary(String contentSummary) {
		this.contentSummary = contentSummary;
	}
	public int getViewNum() {
		return viewNum;
	}
	public void setViewNum(int viewNum) {
		this.viewNum = viewNum;
	}
}
