package com.pjmike.lundao.po;

import java.util.Date;

public class Replyquestion {
    private Integer replyquesid;

    private Integer questionid;

    private Integer view;

    private Integer like;

    private Integer attention;

    private Integer dislike;

    private Integer reply;

    private Integer replylist;

    private String username;

    private Date publishtime;

    private Date contenttime;

    private Integer floor;

    private String describtion;

    public Integer getReplyquesid() {
        return replyquesid;
    }

    public void setReplyquesid(Integer replyquesid) {
        this.replyquesid = replyquesid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
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

    public Integer getReplylist() {
        return replylist;
    }

    public void setReplylist(Integer replylist) {
        this.replylist = replylist;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion == null ? null : describtion.trim();
    }
}