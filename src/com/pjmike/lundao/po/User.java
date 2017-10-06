package com.pjmike.lundao.po;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	private int id;
	private String openid;
	private int mobile;
	private String userSignature;
	private String password;
	private String nickname;
	private String gender;
	private String Icon;
	private int age;
	private String emailNumber;
	private String school;
	private String experience;
	private String educations;
	private String locations;
	private Date birthday;
	private int attentioned;
	private String auth_token;
	private Timestamp created_at;
	private Timestamp updated_at;
	public String getUserSignature() {
		return userSignature;
	}
	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}
	public String getEmailNumber() {
		return emailNumber;
	}
	public void setEmailNumber(String emailNumber) {
		this.emailNumber = emailNumber;
	}
	public String getIcon() {
		return Icon;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getAttentioned() {
		return attentioned;
	}
	public void setAttentioned(int attentioned) {
		this.attentioned = attentioned;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducations() {
		return educations;
	}
	public void setEducations(String educations) {
		this.educations = educations;
	}
	public String getLocations() {
		return locations;
	}
	public void setLocations(String locations) {
		this.locations = locations;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", mobile=" + mobile + ", password=" + password + ", nickname=" + nickname
				+ ", gender=" + gender + ", age=" + age + ", school=" + school + ", experience=" + experience
				+ ", educations=" + educations + ", locations=" + locations + ", birthday=" + birthday
				+ ", attentioned=" + attentioned + ", auth_token=" + auth_token + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
}
