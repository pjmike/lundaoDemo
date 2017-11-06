package com.pjmike.lundao.po;

/**
 * Created by DELL on 2017/10/28.
 */
public class PeriodicalAttention {
    /**
     * 收藏表的id
     */
    private int id;
    /**
     * 收藏人id
     */
    private int userid;
    /**
     * 期刊id
     */
    private int periodicalId;
    /**
     * 对期刊收藏的状态
     */
    private boolean is_Attention;

    /**
     * 获取收藏Id
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取收藏人id
     * @return
     */
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * 获取期刊id
     * @return
     */
    public int getPeriodicalId() {
        return periodicalId;
    }

    public void setPeriodicalId(int periodicalId) {
        this.periodicalId = periodicalId;
    }

    /**
     * 查看是否收藏
     * @return
     */
    public boolean isIs_Attention() {
        return is_Attention;
    }

    public void setIs_Attention(boolean is_Attention) {
        this.is_Attention = is_Attention;
    }
}
