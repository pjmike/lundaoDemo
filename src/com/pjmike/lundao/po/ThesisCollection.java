package com.pjmike.lundao.po;

import com.fasterxml.jackson.annotation.JsonGetter;

public class ThesisCollection {
	private int id;
	private String title;
	private String contentSummary;
	private String content;
	private boolean isShow;
	private boolean isZhanKaiTapped ;
	public int getId() {
		return id;
	}
	@JsonGetter("isShow")
	public boolean isShow() {
		return isShow;
	}
	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	@JsonGetter("isZhanKaiTapped")
	public boolean getZhanKaiTapped() {
		return isZhanKaiTapped;
	}
	public void setZhanKaiTapped(boolean isZhanKaiTapped) {
		this.isZhanKaiTapped = isZhanKaiTapped;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
