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
	public int insetLike(User user, int replyid) {
		return replyMapper.insetLike(user.getId(),replyid);
	}
	/**
	 * 取消点赞
	 */
	@Override
	public int giveupLike(User user, int replyid) {
		return replyMapper.giveupLike(user.getId(), replyid);
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
		// TODO Auto-generated method stub
		return 0;
	}

}
