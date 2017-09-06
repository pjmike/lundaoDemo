package com.pjmike.lundao.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Askquestion {
    private Integer id;

    private Integer thesisId;

    private Integer fromUid;

    private String describtion;

    private String content;

    private int type;
    
    private int state;
    
    private Integer view;

    private Integer like;
    @JsonIgnore
    private Integer attention;
    @JsonIgnore
    private Integer dislike;
    @JsonIgnore
    private Integer reply;
    @JsonIgnore
    private Integer clickcount;
    @JsonIgnore
    private Date publishtime;
    @JsonIgnore
    private Date contenttime;
    private boolean islike = false;
    private boolean isAttention = false;
    
    @JsonGetter("isAttention")
    public boolean Attention() {
		return isAttention;
	}

	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}

	public boolean isIslike() {
		return islike;
	}

	public void setIslike(boolean islike) {
		this.islike = islike;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThesisId() {
        return thesisId;
    }

    public void setThesisId(Integer thesisId) {
        this.thesisId = thesisId;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion == null ? null : describtion.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    @JsonGetter("atype")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type ;
    }

    public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getDislike() {
        return dislike;
    }

    public void setDislike(Integer dislike) {
        this.dislike = dislike;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }

    public Integer getClickcount() {
        return clickcount;
    }

    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Date getContenttime() {
        return contenttime;
    }

    public void setContenttime(Date contenttime) {
        this.contenttime = contenttime;
    }
}