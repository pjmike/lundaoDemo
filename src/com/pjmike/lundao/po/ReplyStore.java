package com.pjmike.lundao.po;

public class ReplyStore {
	private Integer id;

    private Integer commentId;

    private Integer replyId;

    private Integer fromUid;

    private Integer toUid;
    
    private String rDescribtion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getReplyId() {
		return replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public Integer getFromUid() {
		return fromUid;
	}

	public void setFromUid(Integer fromUid) {
		this.fromUid = fromUid;
	}

	public Integer getToUid() {
		return toUid;
	}

	public void setToUid(Integer toUid) {
		this.toUid = toUid;
	}

	public String getrDescribtion() {
		return rDescribtion;
	}

	public void setrDescribtion(String rDescribtion) {
		this.rDescribtion = rDescribtion;
	}
}
