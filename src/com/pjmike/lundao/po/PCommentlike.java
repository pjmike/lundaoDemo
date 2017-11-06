package com.pjmike.lundao.po;

/**
 * Created by DELL on 2017/10/28.
 */
public class PCommentlike {
    /**
     * 评论点赞表的Id
     */
    private int pCommentlikeId;
    /**
     * 用户id
     */
    private int userid;
    /**
     * 评论内容的id
     */
    private int pCommentid;
    /**
     * 评论是否点赞
     */
    private boolean is_like;

    public int getpCommentlikeId() {
        return pCommentlikeId;
    }

    public void setpCommentlikeId(int pCommentlikeId) {
        this.pCommentlikeId = pCommentlikeId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getpCommentid() {
        return pCommentid;
    }

    public void setpCommentid(int pCommentid) {
        this.pCommentid = pCommentid;
    }

    public boolean isIs_like() {
        return is_like;
    }

    public void setIs_like(boolean is_like) {
        this.is_like = is_like;
    }
}
