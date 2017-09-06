package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.DebatetopicMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;
@Service
public class UserAttentionServiceImpl implements UserAttentionService{
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	DebatetopicMapper debatetopicMapper;
	@Override
	public List<Thesis> selectAllThesisAttentioned(int id) {
		return thesisMapper.selectAllThesisAttentioned(id);
	}

	@Override
	public List<Debatetopic> selectAlldebateAttentioned(int id) {
		return debatetopicMapper.selectAlldebateAttentioned(id);
	}

}
