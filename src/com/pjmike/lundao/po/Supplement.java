package com.pjmike.lundao.po;

/**
 * @author pjmike
 * 完善内容
 */
public class Supplement {
	private int id;
	private int thesisId;
	private int userid;
	private String nickname;
	private String Icon;
	private String supplement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThesisId() {
		return thesisId;
	}
	public void setThesisId(int thesisId) {
		this.thesisId = thesisId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getSupplement() {
		return supplement;
	}
	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}
	
}
