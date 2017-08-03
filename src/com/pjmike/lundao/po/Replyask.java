package com.pjmike.lundao.po;

import java.util.Date;

public class Replyask {
    private Integer replyakdid;

    private Integer raAskid;

    private Integer raView;

    private Integer raLike;

    private Integer raAttention;

    private Integer raDislike;

    private Integer raReplyid;

    private String raUsername;

    private Date raPublishtime;

    private Date raContenttime;

    private Integer raFloor;

    private String raDescribtion;

    public Integer getReplyakdid() {
        return replyakdid;
    }

    public void setReplyakdid(Integer replyakdid) {
        this.replyakdid = replyakdid;
    }

    public Integer getRaAskid() {
        return raAskid;
    }

    public void setRaAskid(Integer raAskid) {
        this.raAskid = raAskid;
    }

    public Integer getRaView() {
        return raView;
    }

    public void setRaView(Integer raView) {
        this.raView = raView;
    }

    public Integer getRaLike() {
        return raLike;
    }

    public void setRaLike(Integer raLike) {
        this.raLike = raLike;
    }

    public Integer getRaAttention() {
        return raAttention;
    }

    public void setRaAttention(Integer raAttention) {
        this.raAttention = raAttention;
    }

    public Integer getRaDislike() {
        return raDislike;
    }

    public void setRaDislike(Integer raDislike) {
        this.raDislike = raDislike;
    }

    public Integer getRaReplyid() {
        return raReplyid;
    }

    public void setRaReplyid(Integer raReplyid) {
        this.raReplyid = raReplyid;
    }

    public String getRaUsername() {
        return raUsername;
    }

    public void setRaUsername(String raUsername) {
        this.raUsername = raUsername == null ? null : raUsername.trim();
    }

    public Date getRaPublishtime() {
        return raPublishtime;
    }

    public void setRaPublishtime(Date raPublishtime) {
        this.raPublishtime = raPublishtime;
    }

    public Date getRaContenttime() {
        return raContenttime;
    }

    public void setRaContenttime(Date raContenttime) {
        this.raContenttime = raContenttime;
    }

    public Integer getRaFloor() {
        return raFloor;
    }

    public void setRaFloor(Integer raFloor) {
        this.raFloor = raFloor;
    }

    public String getRaDescribtion() {
        return raDescribtion;
    }

    public void setRaDescribtion(String raDescribtion) {
        this.raDescribtion = raDescribtion == null ? null : raDescribtion.trim();
    }
}