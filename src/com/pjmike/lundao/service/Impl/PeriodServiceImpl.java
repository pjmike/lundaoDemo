package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.mapper.PeriodMapper;
import com.pjmike.lundao.po.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2017/10/28.
 */
@Service
public class PeriodServiceImpl implements PeriodService{
	@Autowired
	PeriodMapper periodMapper;
    /**
     * 返回期刊集锦
     *
     * @return
     */
    @Override
    public List<PeriodCal> selectPeriodical() {
        return periodMapper.selectPeriodical();
    }

    /**
     * 期刊包含评论的主页面
     *
     * @param id
     * @return
     */
    @Override
    public PeriodicalCustom selectPeriodiCalAndCatalog(int id) {
    	PeriodicalCustom periodicalCustoms = periodMapper.selectPeriodiCalAndCatalog(id);
        return periodicalCustoms;
    }

    /**
     * 查看章节内容
     *
     * @param id
     * @return
     */
    @Override
    public String seeChapterContent(int id) {
        return periodMapper.seeChapterContent(id);
    }
    
    /**
     * 查看免费内容
     *
     * @param id
     * @return
     */
    @Override
    public List<String> seeFreeChapterContent(int id) {
        return periodMapper.seeFreeChapterContent(id);
    }

    /**
     * 发表评论
     *
     * @param periodicalComment
     * @return
     */
    @Override
    public int insertComment(PeriodicalComment periodicalComment) {
        return periodMapper.insertComment(periodicalComment);
    }

    /**
     * 对期刊进行收藏
     *
     * @param periodicalAttention
     * @return
     */
    @Override
    public int CollectionPeriodical(PeriodicalAttention periodicalAttention) {
        return periodMapper.CollectionPeriodical(periodicalAttention);
    }

    /**
     * 取消对期刊的收藏
     *
     * @param periodicalAttention
     * @return
     */
    @Override
    public int giveUpCollectionPeriodical(PeriodicalAttention periodicalAttention) {
        return periodMapper.giveUpCollectionPeriodical(periodicalAttention);
    }

    /**
     * 对评论进行点赞
     *
     * @param pCommentlike
     * @return
     */
    @Override
    public int insertCommentLike(PCommentlike pCommentlike) {
        return periodMapper.insertCommentLike(pCommentlike);
    }

    /**
     * 取消评论点赞
     *
     * @param pCommentlike
     * @return
     */
    @Override
    public int giveUpCommentLike(PCommentlike pCommentlike) {
        return periodMapper.giveUpCommentLike(pCommentlike);
    }

    /**
     * 增加推荐数
     *
     * @param periodicalId
     * @return
     */
    @Override
    public int addperiodicalRecommend(int periodicalId) {
        return periodMapper.addperiodicalRecommend(periodicalId);
    }

    /**
     * 减少推荐数
     *
     * @param periodicalId
     * @return
     */
    @Override
    public int reducePeriodicalRecommend(int periodicalId) {
        return periodMapper.reducePeriodicalRecommend(periodicalId);
    }

    /**
     * 增加期刊阅读数
     *
     * @param periodicalId
     * @return
     */
    @Override
    public int addPeriodicalRead(int periodicalId) {
        return periodMapper.addPeriodicalRead(periodicalId);
    }

    /**
     * 增加期刊粉丝数
     *
     * @param periodicalId
     * @return
     */
    @Override
    public int addperiodicalFocus(int periodicalId) {
        return periodMapper.addperiodicalFocus(periodicalId);
    }

    /**
     * 减少期刊粉丝数
     *
     * @param periodicalId
     * @return
     */
    @Override
    public int reduceperiodicalFocus(int periodicalId) {
        return periodMapper.reduceperiodicalFocus(periodicalId);
    }
}
