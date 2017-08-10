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

}
