package com.pjmike.lundao.po;
/**
 * 期刊文章目录结构类
 * @author pjmike
 *
 */
public class PeriodicalCatalog {
	/**
	 * 每一章的id
	 */
	private int chapterId;
	/**
	 *期刊id
	 */
	private int cperiodId;
	/**
	 * 每一章的标题
	 */
	private String chapterTitle;
	/**
	 * 章节的状态
	 */
	private int chapterState;
	/**
	 * 章节的内容
	 */
	private String chapterContent;
	/**
	 * 获取期刊id
	 * @return
	 */
	public int getCperiodId() {
		return cperiodId;
	}
	public void setCperiodId(int cperiodId) {
		this.cperiodId = cperiodId;
	}
	public String getChapterContent() {
		return chapterContent;
	}
	public void setChapterContent(String chapterContent) {
		this.chapterContent = chapterContent;
	}
	/**
	 * 获取章节id
	 * @return
	 */
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	/**
	 * 获取章节题目
	 * @return
	 */
	public String getChapterTitle() {
		return chapterTitle;
	}
	public void setChapterTitle(String chapterTitle) {
		this.chapterTitle = chapterTitle;
	}
	/**
	 * 章节的状态
	 * @return
	 */
	public int getChapterState() {
		return chapterState;
	}
	public void setChapterState(int chapterState) {
		this.chapterState = chapterState;
	}
}
