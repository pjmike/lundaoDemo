package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.po.Askquestion;
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

}
