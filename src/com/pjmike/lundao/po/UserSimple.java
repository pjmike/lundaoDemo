package com.pjmike.lundao.po;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserSimple {
	int id;
	String nickname;
	String Icon;
	boolean isAttention = true;
	String userSignature;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@JsonGetter("Icon")
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	@JsonGetter("isAttention")
	public boolean getAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	public String getUserSignature() {
		return userSignature;
	}
	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}
}
