package com.pjmike.lundao.util;

public class TokenModel {
	//用户ID
	private int userid;
	//随机生成的uuid
	private String token;
	public TokenModel(int userid,String token) {
		this.userid = userid;
		this.token = token;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
