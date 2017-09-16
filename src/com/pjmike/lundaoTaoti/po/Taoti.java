package com.pjmike.lundaoTaoti.po;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Taoti {
	private int taotiId;
	private int userid;
	@JsonIgnore
	private String nickname;
	private String title;
	private String title1;
	private String content;
	private String backgroud;
	private int commentNum;
	@JsonIgnore
	private int comment;
	
	@JsonIgnore
	private String labels;
	
	@JsonIgnore
	private String Icon;
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	private boolean commented = false;
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	/*public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}*/
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public int getTaotiId() {
		return taotiId;
	}
	public void setTaotiId(int taotiId) {
		this.taotiId = taotiId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBackground() {
		return backgroud;
	}
	public void setBackground(String background) {
		this.backgroud = background;
	}
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public boolean isCommented() {
		return commented;
	}
	public void setCommented(boolean commented) {
		this.commented = commented;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
