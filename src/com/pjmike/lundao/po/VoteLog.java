package com.pjmike.lundao.po;

public class VoteLog {
	private int id;
	private int user_id;
	private int debate_id;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getDebate_id() {
		return debate_id;
	}
	public void setDebate_id(int debate_id) {
		this.debate_id = debate_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
