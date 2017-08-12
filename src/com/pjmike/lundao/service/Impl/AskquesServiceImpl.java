package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;
@Service
public class AskquesServiceImpl implements AskquesService{
	@Autowired
	AskquestionMapper askquestionMapper;
	/**
	 * 发起提问及异议
	 */
	@Override
	public int insertaskquestion(Askquestion askquestion) {
		
		return askquestionMapper.insertaskquestion(askquestion);
	}
	@Override
	public int likeNumber(int id) {
		return askquestionMapper.likeNumber(id);
	}
	@Override
	public int Islike(comvote comvote) {
		return askquestionMapper.Islike(comvote);
	}
	@Override
	public int insetLike(comvote comvote) {
		return askquestionMapper.insetLike(comvote);
	}
	@Override
	public int giveupLike(comvote comvote) {
		return askquestionMapper.giveupLike(comvote);
	}
	@Override
	public int deleteAttention(User user, int askid) {
		return askquestionMapper.deleteAttention(user.getId(), askid);
	}
	@Override
	public int insertAttention(User user, int askid) {
		return askquestionMapper.insertAttention(user.getId(), askid);
	}
	@Override
	public int IsAttention(User user, int askid) {
		return askquestionMapper.IsAttention(user.getId(), askid);
	}

}
