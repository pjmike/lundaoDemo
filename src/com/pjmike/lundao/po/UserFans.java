package com.pjmike.lundao.po;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserFans {
	private int id;
	private String Icon;
	private String nickname;
	private String userSignature;
	private boolean isAttention = false;
	private int level;
	private String honors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserSignature() {
		return userSignature;
	}
	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}
	
	public boolean getAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getHonors() {
		return honors;
	}
	public void setHonors(String honors) {
		this.honors = honors;
	}
}
