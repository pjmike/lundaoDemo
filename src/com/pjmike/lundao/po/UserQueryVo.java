package com.pjmike.lundao.po;

public class UserQueryVo {
	private User user;
	
	//为了更好的维护。为了系统扩展性，对原始Dao进行扩展
	
	private UserCustom userCustom;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
}
