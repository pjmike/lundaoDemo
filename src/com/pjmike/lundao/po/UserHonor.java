package com.pjmike.lundao.po;

public class UserHonor {
	private String username;
	private int userclass;
	private int userhonor;
	private int attention;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserclass() {
		return userclass;
	}
	public void setUserclass(int userclass) {
		this.userclass = userclass;
	}
	public int getUserhonor() {
		return userhonor;
	}
	public void setUserhonor(int userhonor) {
		this.userhonor = userhonor;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	@Override
	public String toString() {
		return "UserHonor [username=" + username + ", userclass=" + userclass + ", userhonor=" + userhonor
				+ ", attention=" + attention + "]";
	}
	
}
