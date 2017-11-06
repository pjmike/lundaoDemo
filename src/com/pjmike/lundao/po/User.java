package com.pjmike.lundao.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
/**
 * 用户类
 * @author pjmike
 *
 */
public class User implements Serializable{
	public interface WithoutPasswordView {};
	
	private int id;
	@JsonIgnore
	private String openid;
	@JsonIgnore
	private long mobile;
	private String userSignature;
	@JsonIgnore
	private String password;
	private String nickname;
	private String gender;
	private String Icon;
	private int level;
	private  String honors;
	private int age;
	private String emailNumber;
	private String schoolName;
	private String experience;
	private String educations;
	private String locations;
	private Date birthday;
	@JsonIgnore
	private int attentioned;
	@JsonIgnore
	private String auth_token;
	@JsonIgnore
	private Timestamp created_at;
	@JsonIgnore
	private Timestamp updated_at;
	@JsonView(WithoutPasswordView.class)
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
	@JsonGetter("userPortraitImageUrl")
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
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
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

}
