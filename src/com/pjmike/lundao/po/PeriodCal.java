package com.pjmike.lundao.po;

/**
 * 期刊类
 * @author pjmike
 *
 */
public class PeriodCal {
	/**
	 * 期刊id
	 */
	private int id;
	/**
	 * 期刊封面url
	 */
	private String periodicalCoverUrl;
	/**
	 * 期刊标题
	 */
	private String periodicalTitle;
	/**
	 * 期刊简介内容
	 */
	private String periodicalBrief;
	/**
	 * 期刊阅读量
	 */
	private int periodicalRead;
	/**
	 * 期刊粉丝量
	 */
	private int periodicalFocus;
	/**
	 * 期刊文章目录数
	 */
	private int periodicalCatalogNum;
	/**
	 * 获取期刊文章目录数
	 * @return
	 */
	public int getPeriodicalCatalogNum() {
		return periodicalCatalogNum;
	}
	public void setPeriodicalCatalogNum(int periodicalCatalogNum) {
		this.periodicalCatalogNum = periodicalCatalogNum;
	}
	/**
	 * 获取id
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取期刊粉丝量
	 * @return
	 */
	public int getPeriodicalFocus() {
		return periodicalFocus;
	}
	public void setPeriodicalFocus(int periodicalFocus) {
		this.periodicalFocus = periodicalFocus;
	}
	/**
	 * 获取期刊封面
	 * @return
	 */
	public String getPeriodicalCoverUrl() {
		return periodicalCoverUrl;
	}
	public void setPeriodicalCoverUrl(String periodicalCoverUrl) {
		this.periodicalCoverUrl = periodicalCoverUrl;
	}
	/**
	 * 期刊标题
	 * @return
	 */
	public String getPeriodicalTitle() {
		return periodicalTitle;
	}
	
	public void setPeriodicalTitle(String periodicalTitle) {
		this.periodicalTitle = periodicalTitle;
	}
	/**
	 * 获取期刊简介
	 * @return
	 */
	public String getPeriodicalBrief() {
		return periodicalBrief;
	}
	public void setPeriodicalBrief(String periodicalBrief) {
		this.periodicalBrief = periodicalBrief;
	}
	/**
	 * 获取期刊阅读量
	 * @return
	 */
	public int getPeriodicalRead() {
		return periodicalRead;
	}
	public void setPeriodicalRead(int periodicalRead) {
		this.periodicalRead = periodicalRead;
	}
	
}
