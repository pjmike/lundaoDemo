package com.pjmike.lundao.po;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AskquestionExtend extends Askquestion{
	private String nickname ="";
	
	private String Icon ="";
	
	private boolean isShow ;
	
	private boolean dislike = false;
	
	private List<ReplyExtend> replylist;
	public List<ReplyExtend> getReplylist() {
		return replylist;
	}

	public void setReplylist(List<ReplyExtend> replylist) {
		this.replylist = replylist;
	}

	@JsonGetter("dislike")
	public boolean Dislike() {
		return dislike;
	}
	
	public void setDislike(boolean dislike) {
		this.dislike = dislike;
	}

	@JsonGetter("isShow")
	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	@JsonIgnore
	private ReplyExtend replyextend;
	
	public ReplyExtend getReplyextend() {
		return replyextend;
	}

	public void setReplyextend(ReplyExtend replyextend) {
		this.replyextend = replyextend;
	}

	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@JsonGetter("Icon")
	public String getIcon() {
		return Icon;
	}

	public void setIcon(String icon) {
		Icon = icon;
	}
	@JsonIgnore
	private List<ReplyExtend> replies;
	
	public List<ReplyExtend> getReplies() {
		return replies;
	}

	public void setReplies(List<ReplyExtend> replies) {
		this.replies = replies;
	}
}
