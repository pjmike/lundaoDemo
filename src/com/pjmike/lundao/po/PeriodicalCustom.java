package com.pjmike.lundao.po;

import java.util.List;

/**
 * periodcal的继承类
 * 里面包含章节目录List和评论List
 * @author pjmike
 *
 */
public class PeriodicalCustom extends PeriodCal{
	/**
	 * 文章目录结构List
	 */
	private List<PeriodicalCatalog> periodicalCatalogs;
	/**
	 * 评论List
	 */
	private List<PeriodicalComment> periodicalComments;
	/**
	 * 获取文章目录结构
	 * @return
	 */
	public List<PeriodicalCatalog> getPeriodicalCatalogs() {
		return periodicalCatalogs;
	}
	public void setPeriodicalCatalogs(List<PeriodicalCatalog> periodicalCatalogs) {
		this.periodicalCatalogs = periodicalCatalogs;
	}
	/**
	 * 获取评论
	 * @return
	 */
	public List<PeriodicalComment> getPeriodicalComments() {
		return periodicalComments;
	}
	public void setPeriodicalComments(List<PeriodicalComment> periodicalComments) {
		this.periodicalComments = periodicalComments;
	}
}
