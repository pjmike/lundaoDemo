package com.pjmike.lundao.po;

public class Askcondition {
    private Integer askcdid;

    private String solve;

    private String discuss;

    public Integer getAskcdid() {
        return askcdid;
    }

    public void setAskcdid(Integer askcdid) {
        this.askcdid = askcdid;
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve == null ? null : solve.trim();
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss == null ? null : discuss.trim();
    }
}