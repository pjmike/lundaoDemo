package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.*;

/**
 * 期刊业余接口
 * @author pjmike
 *
 */
public interface PeriodService {
	/**
	 * 返回期刊集锦
	 * @return
	 */
	public List<PeriodCal> selectPeriodical();

	/**
	 * 期刊包含评论的主页面
	 * @param id
	 * @return
	 */
	public PeriodicalCustom selectPeriodiCalAndCatalog(int id);

	/**
	 * 查看章节内容
	 * @param id
	 * @return
	 */
	String seeChapterContent(int id);

	/**
	 * 查看免费内容
	 * @param id
	 * @return
	 */
	List<String> seeFreeChapterContent(int id);

	/**
	 * 发表评论
	 * @param periodicalComment
	 * @return
	 */
	int insertComment(PeriodicalComment periodicalComment);

	/**
	 * 对期刊进行收藏
	 * @param periodicalAttention
	 * @return
	 */
	int CollectionPeriodical(PeriodicalAttention periodicalAttention);

	/**
	 * 取消对期刊的收藏
	 * @param periodicalAttention
	 * @return
	 */
	int giveUpCollectionPeriodical(PeriodicalAttention periodicalAttention);

	/**
	 * 对评论进行点赞
	 * @param pCommentlike
	 * @return
	 */
	int insertCommentLike(PCommentlike pCommentlike);

	/**
	 * 取消评论点赞
	 * @param pCommentlike
	 * @return
	 */
	int giveUpCommentLike(PCommentlike pCommentlike);

	/**
	 * 增加推荐数
	 * @param periodicalId
	 * @return
	 */
	int addperiodicalRecommend(int periodicalId);

	/**
	 * 减少推荐数
	 * @param periodicalId
	 * @return
	 */
	int reducePeriodicalRecommend(int periodicalId);

	/**
	 * 增加期刊阅读数
	 * @param periodicalId
	 * @return
	 */
	int addPeriodicalRead(int periodicalId);

	/**
	 *	增加期刊粉丝数
	 * @param periodicalId
	 * @return
	 */
	int addperiodicalFocus(int periodicalId);

	/**
	 * 减少期刊粉丝数
	 * @param periodicalId
	 * @return
	 */
	int reduceperiodicalFocus(int periodicalId);

}
