package com.pjmike.lundao.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * 搜索出来的辩题信息
 * @author pjmike
 *
 */
public class DebateTopicCustom {
	private int topicId;
	private String describtion;
	private String content;
	private String title1;
    private Integer like;
    private int view;
    private boolean islike = false;
    private boolean isAttention = false;
    @JsonGetter("islike")
    public boolean getIslike() {
		return islike;
	}
	public void setIslike(boolean islike) {
		this.islike = islike;
	}
	@JsonGetter("isAttention")
	public boolean getAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
    
    public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public Integer getLike() {
		return like;
	}
	public void setLike(Integer like) {
		this.like = like;
	}
	
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
}


