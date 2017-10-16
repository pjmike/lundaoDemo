package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.mapper.ThesisMapper;

@Service
public class GetUseridServiceImpl implements GetUseridService {
	@Autowired
	ReplyMapper replyMapper;
	@Autowired
	AskquestionMapper askquestionMapper;
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public int getUserIdOfReply(int id) {
		return replyMapper.selectUseridOfReply(id);
	}

	@Override
	public int getUserIdOfASkquestion(int id) {
		return askquestionMapper.selectUserIdOfAskquestion(id);
	}

	@Override
	public int getUserIdOfThesis(int id) {
		return thesisMapper.selectUseridOfThesis(id);
	}

}
