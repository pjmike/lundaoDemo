package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskconditionMapper;
import com.pjmike.lundao.mapper.DebatetopicMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;

@Service
public class MyAttentionServiceImpl implements MyAttentionService{
	@Autowired
	DebatetopicMapper debatetopicMapper;
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	AskconditionMapper askconditionMapper;
	@Override
	public List<Askquestion> selecrAllAttentionAskqustion(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Debatetopic> selectAlldebateAttentioned(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Thesis> selectAllThesisAttentioned(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
