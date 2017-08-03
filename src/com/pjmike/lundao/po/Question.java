package com.pjmike.lundao.po;

import java.util.Date;

public class Question {
    private Integer qQuestionid;

    private Integer qDebateid;

    private String qDescribtion;

    private String qContent;

    private String qStatus;

    private Integer qView;

    private Integer qLike;

    private Integer qAttention;

    private Integer qDislike;

    private Integer qReply;

    private Integer qReplylist;

    private Integer qClickcount;

    private String qUsername;

    private Date qPublishtime;

    private Date qContenttime;

    public Integer getqQuestionid() {
        return qQuestionid;
    }

    public void setqQuestionid(Integer qQuestionid) {
        this.qQuestionid = qQuestionid;
    }

    public Integer getqDebateid() {
        return qDebateid;
    }

    public void setqDebateid(Integer qDebateid) {
        this.qDebateid = qDebateid;
    }

    public String getqDescribtion() {
        return qDescribtion;
    }

    public void setqDescribtion(String qDescribtion) {
        this.qDescribtion = qDescribtion == null ? null : qDescribtion.trim();
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent == null ? null : qContent.trim();
    }

    public String getqStatus() {
        return qStatus;
    }

    public void setqStatus(String qStatus) {
        this.qStatus = qStatus == null ? null : qStatus.trim();
    }

    public Integer getqView() {
        return qView;
    }

    public void setqView(Integer qView) {
        this.qView = qView;
    }

    public Integer getqLike() {
        return qLike;
    }

    public void setqLike(Integer qLike) {
        this.qLike = qLike;
    }

    public Integer getqAttention() {
        return qAttention;
    }

    public void setqAttention(Integer qAttention) {
        this.qAttention = qAttention;
    }

    public Integer getqDislike() {
        return qDislike;
    }

    public void setqDislike(Integer qDislike) {
        this.qDislike = qDislike;
    }

    public Integer getqReply() {
        return qReply;
    }

    public void setqReply(Integer qReply) {
        this.qReply = qReply;
    }

    public Integer getqReplylist() {
        return qReplylist;
    }

    public void setqReplylist(Integer qReplylist) {
        this.qReplylist = qReplylist;
    }

    public Integer getqClickcount() {
        return qClickcount;
    }

    public void setqClickcount(Integer qClickcount) {
        this.qClickcount = qClickcount;
    }

    public String getqUsername() {
        return qUsername;
    }

    public void setqUsername(String qUsername) {
        this.qUsername = qUsername == null ? null : qUsername.trim();
    }

    public Date getqPublishtime() {
        return qPublishtime;
    }

    public void setqPublishtime(Date qPublishtime) {
        this.qPublishtime = qPublishtime;
    }

    public Date getqContenttime() {
        return qContenttime;
    }

    public void setqContenttime(Date qContenttime) {
        this.qContenttime = qContenttime;
    }
}