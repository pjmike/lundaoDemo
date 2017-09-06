package com.pjmike.lundao.po;

public class AskquestionAttention {
	private int id;
	private int IdState;
	private String title;
	private String contentSummary;
	private String viewNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdState() {
		return IdState;
	}
	public void setIdState(int idState) {
		IdState = idState;
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
	public String getViewNum() {
		return viewNum;
	}
	public void setViewNum(String viewNum) {
		this.viewNum = viewNum;
	}
	
}
