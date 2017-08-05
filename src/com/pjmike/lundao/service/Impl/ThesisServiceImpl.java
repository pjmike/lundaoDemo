package com.pjmike.lundao.service.Impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.ThesisExtend;

@Service
public class ThesisServiceImpl implements ThesisService {
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public ThesisExtend selectBythesisId(int id) {
		ThesisExtend thesisextend = thesisMapper.selectBythesisId(id);
		List<AskquestionExtend> askquestions = thesisextend.getAskquestions();
		if(askquestions == null || askquestions.size()==0) {
			askquestions = new ArrayList<>();
		}
		for(AskquestionExtend as:askquestions) {
			List<Reply> replies = as.getReplies();
		}
		
		return thesisextend;
		
	}
	

}
