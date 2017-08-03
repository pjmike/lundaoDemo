package com.pjmike.lundao.po;

import java.util.Date;

public class Thesis {
    private Integer thesisid;

    private Integer tDebateid;

    private String tDescription;

    private Integer tView;

    private Integer tLike;

    private Integer tAttention;

    private Integer tDislike;

    private Integer tAsk;

    private Integer tQuestion;

    private Integer tAsklist;

    private Integer tQuestionlist;

    private Date tPublishtime;

    private Date tContenttime;

    private Integer complete;

    private Integer uncomplete;

    private String tState;

    public Integer getThesisid() {
        return thesisid;
    }

    public void setThesisid(Integer thesisid) {
        this.thesisid = thesisid;
    }

    public Integer gettDebateid() {
        return tDebateid;
    }

    public void settDebateid(Integer tDebateid) {
        this.tDebateid = tDebateid;
    }

    public String gettDescription() {
        return tDescription;
    }

    public void settDescription(String tDescription) {
        this.tDescription = tDescription == null ? null : tDescription.trim();
    }

    public Integer gettView() {
        return tView;
    }

    public void settView(Integer tView) {
        this.tView = tView;
    }

    public Integer gettLike() {
        return tLike;
    }

    public void settLike(Integer tLike) {
        this.tLike = tLike;
    }

    public Integer gettAttention() {
        return tAttention;
    }

    public void settAttention(Integer tAttention) {
        this.tAttention = tAttention;
    }

    public Integer gettDislike() {
        return tDislike;
    }

    public void settDislike(Integer tDislike) {
        this.tDislike = tDislike;
    }

    public Integer gettAsk() {
        return tAsk;
    }

    public void settAsk(Integer tAsk) {
        this.tAsk = tAsk;
    }

    public Integer gettQuestion() {
        return tQuestion;
    }

    public void settQuestion(Integer tQuestion) {
        this.tQuestion = tQuestion;
    }

    public Integer gettAsklist() {
        return tAsklist;
    }

    public void settAsklist(Integer tAsklist) {
        this.tAsklist = tAsklist;
    }

    public Integer gettQuestionlist() {
        return tQuestionlist;
    }

    public void settQuestionlist(Integer tQuestionlist) {
        this.tQuestionlist = tQuestionlist;
    }

    public Date gettPublishtime() {
        return tPublishtime;
    }

    public void settPublishtime(Date tPublishtime) {
        this.tPublishtime = tPublishtime;
    }

    public Date gettContenttime() {
        return tContenttime;
    }

    public void settContenttime(Date tContenttime) {
        this.tContenttime = tContenttime;
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Integer getUncomplete() {
        return uncomplete;
    }

    public void setUncomplete(Integer uncomplete) {
        this.uncomplete = uncomplete;
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState == null ? null : tState.trim();
    }
}