package com.pjmike.lundao.po;

//User的扩展类
public class UserCustom extends User{
	private int likeNumber;
	private int attentionNumber;
	private int fans;
	private int myDebates;
	private int myThesis;
	private int myReplys;
	private int myAttention;
	public int getLikeNumber() {
		return likeNumber;
	}
	public int getMyAttention() {
		return myAttention;
	}
	public void setMyAttention(int myAttention) {
		this.myAttention = myAttention;
	}
	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}
	public int getAttentionNumber() {
		return attentionNumber;
	}
	public void setAttentionNumber(int attentionNumber) {
		this.attentionNumber = attentionNumber;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getMyDebates() {
		return myDebates;
	}
	public void setMyDebates(int myDebates) {
		this.myDebates = myDebates;
	}
	public int getMyThesis() {
		return myThesis;
	}
	public void setMyThesis(int myThesis) {
		this.myThesis = myThesis;
	}
	public int getMyReplys() {
		return myReplys;
	}
	public void setMyReplys(int myReplys) {
		this.myReplys = myReplys;
	}
}
