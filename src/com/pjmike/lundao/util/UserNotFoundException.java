package com.pjmike.lundao.util;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
	private long mobile;

	public long getMobile() {
		return mobile;
	}

	public UserNotFoundException(long mobile) {
		super();
		this.mobile = mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
