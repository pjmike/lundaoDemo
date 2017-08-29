package com.pjmike.lundao.po;

public class AskquestionReply extends Askquestion{
	private String nickname ="";
	private String Icon ="";
	private ReplyExtend replyextend;
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
	public ReplyExtend getReplyextend() {
		return replyextend;
	}
	public void setReplyextend(ReplyExtend replyextend) {
		this.replyextend = replyextend;
	}
	
}
