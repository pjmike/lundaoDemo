package com.pjmike.lundao.po;

public class UserAmount {
	private int debfavor;
	private int thesisfavor;
	private int thesiscollect;
	private int complete;
	private int askCount;
	private int objection;
	private int owndebate;
	private int ownthesis;
	private int speakcount;
	private int speakfavor;
	public int getDebfavor() {
		return debfavor;
	}
	public void setDebfavor(int debfavor) {
		this.debfavor = debfavor;
	}
	public int getThesisfavor() {
		return thesisfavor;
	}
	public void setThesisfavor(int thesisfavor) {
		this.thesisfavor = thesisfavor;
	}
	public int getThesiscollect() {
		return thesiscollect;
	}
	public void setThesiscollect(int thesiscollect) {
		this.thesiscollect = thesiscollect;
	}
	public int getComplete() {
		return complete;
	}
	public void setComplete(int complete) {
		this.complete = complete;
	}
	public int getAskCount() {
		return askCount;
	}
	public void setAskCount(int askCount) {
		this.askCount = askCount;
	}
	public int getObjection() {
		return objection;
	}
	public void setObjection(int objection) {
		this.objection = objection;
	}
	public int getOwndebate() {
		return owndebate;
	}
	public void setOwndebate(int owndebate) {
		this.owndebate = owndebate;
	}
	public int getOwnthesis() {
		return ownthesis;
	}
	public void setOwnthesis(int ownthesis) {
		this.ownthesis = ownthesis;
	}
	public int getSpeakcount() {
		return speakcount;
	}
	public void setSpeakcount(int speakcount) {
		this.speakcount = speakcount;
	}
	public int getSpeakfavor() {
		return speakfavor;
	}
	public void setSpeakfavor(int speakfavor) {
		this.speakfavor = speakfavor;
	}
	@Override
	public String toString() {
		return "UserAmount [debfavor=" + debfavor + ", thesisfavor=" + thesisfavor + ", thesiscollect=" + thesiscollect
				+ ", complete=" + complete + ", askCount=" + askCount + ", objection=" + objection + ", owndebate="
				+ owndebate + ", ownthesis=" + ownthesis + ", speakcount=" + speakcount + ", speakfavor=" + speakfavor
				+ "]";
	}
	
}
