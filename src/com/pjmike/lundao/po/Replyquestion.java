package com.pjmike.lundao.po;

import java.util.Date;

public class Replyquestion {
    private Integer replyquesid;

    private Integer rqQuestionid;

    private Integer rqView;

    private Integer rqLike;

    private Integer rqAttention;

    private Integer rqDislike;

    private Integer rqReplyid;

    private String rqUsername;

    private Date rqPublishtime;

    private Date rqContenttime;

    private Integer rqFloor;

    private String rqDescribtion;

    public Integer getReplyquesid() {
        return replyquesid;
    }

    public void setReplyquesid(Integer replyquesid) {
        this.replyquesid = replyquesid;
    }

    public Integer getRqQuestionid() {
        return rqQuestionid;
    }

    public void setRqQuestionid(Integer rqQuestionid) {
        this.rqQuestionid = rqQuestionid;
    }

    public Integer getRqView() {
        return rqView;
    }

    public void setRqView(Integer rqView) {
        this.rqView = rqView;
    }

    public Integer getRqLike() {
        return rqLike;
    }

    public void setRqLike(Integer rqLike) {
        this.rqLike = rqLike;
    }

    public Integer getRqAttention() {
        return rqAttention;
    }

    public void setRqAttention(Integer rqAttention) {
        this.rqAttention = rqAttention;
    }

    public Integer getRqDislike() {
        return rqDislike;
    }

    public void setRqDislike(Integer rqDislike) {
        this.rqDislike = rqDislike;
    }

    public Integer getRqReplyid() {
        return rqReplyid;
    }

    public void setRqReplyid(Integer rqReplyid) {
        this.rqReplyid = rqReplyid;
    }

    public String getRqUsername() {
        return rqUsername;
    }

    public void setRqUsername(String rqUsername) {
        this.rqUsername = rqUsername == null ? null : rqUsername.trim();
    }

    public Date getRqPublishtime() {
        return rqPublishtime;
    }

    public void setRqPublishtime(Date rqPublishtime) {
        this.rqPublishtime = rqPublishtime;
    }

    public Date getRqContenttime() {
        return rqContenttime;
    }

    public void setRqContenttime(Date rqContenttime) {
        this.rqContenttime = rqContenttime;
    }

    public Integer getRqFloor() {
        return rqFloor;
    }

    public void setRqFloor(Integer rqFloor) {
        this.rqFloor = rqFloor;
    }

    public String getRqDescribtion() {
        return rqDescribtion;
    }

    public void setRqDescribtion(String rqDescribtion) {
        this.rqDescribtion = rqDescribtion == null ? null : rqDescribtion.trim();
    }
}