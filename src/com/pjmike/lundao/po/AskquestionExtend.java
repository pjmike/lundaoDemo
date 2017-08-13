package com.pjmike.lundao.po;

import java.util.List;

public class AskquestionExtend extends Askquestion{
	private String nickname ="";
	private String Icon ="";
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
	private ReplyExtend extend;
	public ReplyExtend getExtend() {
		return extend;
	}

	public void setExtend(ReplyExtend extend) {
		this.extend = extend;
	}
	private List<ReplyExtend> replies;

	public List<ReplyExtend> getReplies() {
		return replies;
	}

	public void setReplies(List<ReplyExtend> replies) {
		this.replies = replies;
	}
}
