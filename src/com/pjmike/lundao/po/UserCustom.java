package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * User的扩展类
 * @author pjmike
 *
 */
public class UserCustom extends User{
	private boolean isAttention = false;
	@JsonGetter("Attentioned")
	public boolean Attention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	private List<PeriodicalItemList> periodicalItemList = new ArrayList<PeriodicalItemList>();
	public List<PeriodicalItemList> getPeriodicalItemList() {
		return periodicalItemList;
	}
	public void setPeriodicalItemList(List<PeriodicalItemList> periodicalItemList) {
		this.periodicalItemList = periodicalItemList;
	}
	private String backgroundImageUrl;
	private String constellation;
	private int like;
	private int attention;
	private int fansAmounts;
	private int debateTopic;
	private int thesis;
	private int presentations;
	public String getBackgroundImageUrl() {
		return backgroundImageUrl;
	}
	public void setBackgroundImageUrl(String backgroundImageUrl) {
		this.backgroundImageUrl = backgroundImageUrl;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	public int getFansAmounts() {
		return fansAmounts;
	}
	public void setFansAmounts(int fansAmounts) {
		this.fansAmounts = fansAmounts;
	}
	public int getDebateTopic() {
		return debateTopic;
	}
	public void setDebateTopic(int debateTopic) {
		this.debateTopic = debateTopic;
	}
	public int getThesis() {
		return thesis;
	}
	public void setThesis(int thesis) {
		this.thesis = thesis;
	}
	public int getPresentations() {
		return presentations;
	}
	public void setPresentations(int presentations) {
		this.presentations = presentations;
	}
	
}
