package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.po.Reply;

@Service
public class ThesisServiceImpl implements ThesisService {
	@Autowired
	ReplyMapper replyMapper;
	@Override
	public List<Reply> selectByPrimaryKey(Integer debateId) {
		List<Reply> replylist = replyMapper.selectByPrimaryKey(debateId);
		return replylist;
	}

}
