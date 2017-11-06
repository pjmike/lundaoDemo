package com.pjmike.lundao.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.User;
@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyMapper replyMapper;
	/**
	 * 添加回复
	 */
	@Override
	public int insert(User user, Reply reply) {
		return replyMapper.insert(user, reply);
	}
	
	/**
	 * 点赞
	 */
	@Override
	public int insetLike(int userid, int replyid) {
		return replyMapper.insetLike(userid,replyid);
	}
	/**
	 * 取消点赞
	 */
	
	@Override
	public int giveupLike(int userid, int replyid) {
		return replyMapper.giveupLike(userid, replyid);
	}
	/**
	 * 点赞数
	 */
	@Override
	public int likeNumber(int id) {
		return replyMapper.likeNumber(id);
	}
	/**
	 * 是否点赞
	 */
	@Override
	public int Islike(User user, int replyid) {
		return replyMapper.Islike(user.getId(), replyid);
	}
	/**
	 * 发表回复
	 */
	@Override
	public int reply(Reply reply) {
		return replyMapper.reply(reply);
	}

	@Override
	public int changereplyIsShow(int id, int replyid) {
		return replyMapper.changereplyIsShow(id, replyid);
	}

	@Override
	public Integer selectIsShow(int id, int replyid) {
		return replyMapper.selectIsShow(id, replyid);
	}

	@Override
	public int AgainLike(int id, int replyid) {
		return replyMapper.AgainLike(id, replyid);
	}

	@Override
	public int selectLike(int id, int replyid) {
		return replyMapper.selectLike(id, replyid);
	}

	@Override
	public String selectContent(int id) {
		return replyMapper.selectContent(id);
	}

}
