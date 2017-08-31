package com.pjmike.lundao.po;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Reply {
    private Integer id;

    private Integer commentId;
    
    private Integer replyId;

    private Integer fromUid;

    private Integer toUid;

    private int rType;
    @JsonIgnore
    private Integer rView;

    private Integer rLike;
    @JsonIgnore
    private Integer rAttention;
    @JsonIgnore
    private Integer rDislike;

    private Date rPublishtime;
    
    private Date rContenttime;
    
    @JsonIgnore
    private Integer rFloor;

    private String rDescribtion;
    
    private boolean islike = false;
    
    
  public boolean isIslike() {
		return islike;
	}

	public void setIslike(boolean islike) {
		this.islike = islike;
	}

	/*  private List<Reply> replies;
    public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
*/
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

    public int getrType() {
        return rType;
    }

    public void setrType(int rType) {
        this.rType = rType;
    }

    public Integer getrView() {
        return rView;
    }

    public void setrView(Integer rView) {
        this.rView = rView;
    }

    public Integer getrLike() {
        return rLike;
    }

    public void setrLike(Integer rLike) {
        this.rLike = rLike;
    }

    public Integer getrAttention() {
        return rAttention;
    }

    public void setrAttention(Integer rAttention) {
        this.rAttention = rAttention;
    }

    public Integer getrDislike() {
        return rDislike;
    }

    public void setrDislike(Integer rDislike) {
        this.rDislike = rDislike;
    }

    public Date getrPublishtime() {
        return rPublishtime;
    }

    public void setrPublishtime(Date rPublishtime) {
        this.rPublishtime = rPublishtime;
    }

    public Date getrContenttime() {
        return rContenttime;
    }

    public void setrContenttime(Date rContenttime) {
        this.rContenttime = rContenttime;
    }

    public Integer getrFloor() {
        return rFloor;
    }

    public void setrFloor(Integer rFloor) {
        this.rFloor = rFloor;
    }

    public String getrDescribtion() {
        return rDescribtion;
    }

    public void setrDescribtion(String rDescribtion) {
        this.rDescribtion = rDescribtion == null ? null : rDescribtion.trim();
    }
}