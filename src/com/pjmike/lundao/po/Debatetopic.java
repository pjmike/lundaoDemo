package com.pjmike.lundao.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Debatetopic {
    private Integer topicid;

    private String describtion;
    
    private Integer view;
    
    private Integer like;
    private Integer attention;
    @JsonIgnore
    private Integer dislike;
    @JsonIgnore
    private Integer clickcount;
    @JsonIgnore
    private String nickname;
    @JsonIgnore
    private Integer thesis;
    @JsonIgnore
    private Integer debatelist;
    
    private Date publishtime;
    @JsonIgnore
    private String label;
    @JsonIgnore
    private Date contenttime;
    private String title1;
    public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	private String content;
    private boolean islike = false;
    private boolean isAttention = false;
    private String backgroud;
     public String getBackgroud() {
		return backgroud;
	}

	public void setBackgroud(String backgroud) {
		this.backgroud = backgroud;
	}

    public boolean isIslike() {
		return islike;
	}

	public void setIslike(boolean islike) {
		this.islike = islike;
	}
	@JsonGetter("isAttention")
	public boolean getAttention2() {
		return isAttention;
	}

	public void setAttention2(boolean isAttention) {
		this.isAttention = isAttention;
	}


	public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion == null ? null : describtion.trim();
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

    public Integer getClickcount() {
        return clickcount;
    }

    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    public String getUsername() {
        return nickname;
    }

    public void setUsername(String username) {
        this.nickname = username == null ? null : username.trim();
    }

    public Integer getThesis() {
        return thesis;
    }

    public void setThesis(Integer thesis) {
        this.thesis = thesis;
    }

    public Integer getDebatelist() {
        return debatelist;
    }

    public void setDebatelist(Integer debatelist) {
        this.debatelist = debatelist;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Date getContenttime() {
        return contenttime;
    }

    public void setContenttime(Date contenttime) {
        this.contenttime = contenttime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}