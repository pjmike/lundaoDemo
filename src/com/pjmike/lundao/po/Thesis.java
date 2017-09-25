package com.pjmike.lundao.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Thesis {
    private Integer thesisid;

    private Integer tDebateid;

    private String tDescription;
    
    private Integer tView;
    
    private Integer tfromuid;
    
    private Integer tLike;
    
    private String nickname;
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	private Integer tAttention;
	@JsonIgnore
    private Integer tDislike;
	@JsonIgnore
    private Integer tAsk;
	@JsonIgnore
    private Integer tQuestion;
	@JsonIgnore
    private Integer tAsklist;
	@JsonIgnore
    private Integer tQuestionlist;
	@JsonIgnore
    private Date tPublishtime;
	@JsonIgnore
    private Date tContenttime;

    private Integer complete;
    
    private Integer uncomplete;

    private String tState;
    
    private boolean islike = false;
     
    private boolean isAttention = false;

	public Integer getThesisid() {
		return thesisid;
	}

	public void setThesisid(Integer thesisid) {
		this.thesisid = thesisid;
	}

	public Integer gettDebateid() {
		return tDebateid;
	}

	public void settDebateid(Integer tDebateid) {
		this.tDebateid = tDebateid;
	}
	
	public String getTdescription() {
		return tDescription;
	}
	
	public void setTdescription(String tDescription) {
		this.tDescription = tDescription;
	}

	public Integer gettView() {
		return tView;
	}

	public void settView(Integer tView) {
		this.tView = tView;
	}

	public Integer getTfromuid() {
		return tfromuid;
	}

	public void setTfromuid(Integer tfromuid) {
		this.tfromuid = tfromuid;
	}

	public Integer gettLike() {
		return tLike;
	}

	public void settLike(Integer tLike) {
		this.tLike = tLike;
	}

	public Integer gettAttention() {
		return tAttention;
	}

	public void settAttention(Integer tAttention) {
		this.tAttention = tAttention;
	}

	public Integer gettDislike() {
		return tDislike;
	}

	public void settDislike(Integer tDislike) {
		this.tDislike = tDislike;
	}

	public Integer gettAsk() {
		return tAsk;
	}

	public void settAsk(Integer tAsk) {
		this.tAsk = tAsk;
	}

	public Integer gettQuestion() {
		return tQuestion;
	}

	public void settQuestion(Integer tQuestion) {
		this.tQuestion = tQuestion;
	}

	public Integer gettAsklist() {
		return tAsklist;
	}

	public void settAsklist(Integer tAsklist) {
		this.tAsklist = tAsklist;
	}

	public Integer gettQuestionlist() {
		return tQuestionlist;
	}

	public void settQuestionlist(Integer tQuestionlist) {
		this.tQuestionlist = tQuestionlist;
	}

	public Date gettPublishtime() {
		return tPublishtime;
	}

	public void settPublishtime(Date tPublishtime) {
		this.tPublishtime = tPublishtime;
	}

	public Date gettContenttime() {
		return tContenttime;
	}

	public void settContenttime(Date tContenttime) {
		this.tContenttime = tContenttime;
	}

	public Integer getComplete() {
		return complete;
	}

	public void setComplete(Integer complete) {
		this.complete = complete;
	}

	public Integer getUncomplete() {
		return uncomplete;
	}

	public void setUncomplete(Integer uncomplete) {
		this.uncomplete = uncomplete;
	}
	
	@JsonGetter("tState")
	public String getTstate() {
		return tState;
	}

	public void setTstate(String tState) {
		this.tState = tState;
	}
	@JsonGetter("isAttention")
	public boolean getAttention() {
		return isAttention;
	}

	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	@JsonGetter("islike")
	public boolean isLike() {
		return islike;
	}
	
	public void setLike(boolean islike) {
		this.islike = islike;
	}
   
}
