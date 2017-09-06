package com.pjmike.lundao.po;

public class AskquAttention {
	private Integer id;
	private String title;
	private String contentSummary;
	private Integer IdState;
	private Integer viewNum;
	public Integer getId() {
		return id;
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
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdState() {
		return IdState;
	}
	public void setIdState(Integer idState) {
		IdState = idState;
	}
	public Integer getViewNum() {
		return viewNum;
	}
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}


	
}
