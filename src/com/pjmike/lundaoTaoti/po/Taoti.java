package com.pjmike.lundaoTaoti.po;

public class Taoti {
	private int taotiId;
	private String nickname;
	private String Icon;
	private String title;
	private String title1;
	private String content;
	private String background;
	private int commentNum;
	private int comment;
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	private boolean commented;
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
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
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
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
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
}