package com.pjmike.lundao.po;

import java.util.Date;

/**
 * 期刊评论类
 * @author pjmike
 *
 */
public class PeriodicalComment {
	/**
	 * 期刊评论id
	 */
	private int periodicalCommentId;
	/**
	 * 期刊的id
	 */
	private int pPeriodical;
	
	/**
	 * 期刊评论用户id
	 */
	private int periodicalCommentUserId;
	/**
	 * 期刊评论用户头像
	 */
	private String periodicalCommentUserPortraitUrl;
	/**
	 * 期刊评论时间
	 */
	private Date periodicalCommentTime;
	/**
	 * 期刊评论点赞数
	 */
	private int periodicalCommentLike;
	/**
	 * periodicalCommentContent
	 */
	private String periodicalCommentContent;
	/**
	 * 期刊的id
	 * @return
	 */
	public int getpPeriodical() {
		return pPeriodical;
	}
	public void setpPeriodical(int pPeriodical) {
		this.pPeriodical = pPeriodical;
	}
	/**
	 * 获取期刊评论id
	 * @return
	 */
	public int getPeriodicalCommentId() {
		return periodicalCommentId;
	}
	public void setPeriodicalCommentId(int periodicalCommentId) {
		this.periodicalCommentId = periodicalCommentId;
	}
	/**
	 * 获取期刊评论用户id
	 * @return
	 */
	public int getPeriodicalCommentUserId() {
		return periodicalCommentUserId;
	}
	public void setPeriodicalCommentUserId(int periodicalCommentUserId) {
		this.periodicalCommentUserId = periodicalCommentUserId;
	}
	/**
	 * 获取期刊评论用户头像
	 * @return
	 */
	public String getPeriodicalCommentUserPortraitUrl() {
		return periodicalCommentUserPortraitUrl;
	}
	public void setPeriodicalCommentUserPortraitUrl(String periodicalCommentUserPortraitUrl) {
		this.periodicalCommentUserPortraitUrl = periodicalCommentUserPortraitUrl;
	}
	/**
	 * 获取期刊评论时间
	 * @return
	 */
	public Date getPeriodicalCommentTime() {
		return periodicalCommentTime;
	}
	public void setPeriodicalCommentTime(Date periodicalCommentTime) {
		this.periodicalCommentTime = periodicalCommentTime;
	}
	/**
	 * 获取期刊评论点赞数
	 * @return
	 */
	public int getPeriodicalCommentLike() {
		return periodicalCommentLike;
	}
	public void setPeriodicalCommentLike(int periodicalCommentLike) {
		this.periodicalCommentLike = periodicalCommentLike;
	}
	/**
	 * 获取期刊评论内容
	 * @return
	 */
	public String getPeriodicalCommentContent() {
		return periodicalCommentContent;
	}
	public void setPeriodicalCommentContent(String periodicalCommentContent) {
		this.periodicalCommentContent = periodicalCommentContent;
	}
	
}
