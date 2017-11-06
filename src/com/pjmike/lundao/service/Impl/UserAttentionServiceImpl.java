package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.DebatetopicMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.DebateTopicSimple;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisSimple;
@Service
public class UserAttentionServiceImpl implements UserAttentionService{
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	DebatetopicMapper debatetopicMapper;
	@Override
	public List<ThesisSimple> selectAllThesisAttentioned(int id) {
		return thesisMapper.selectAllThesisAttentioned(id);
	}

	@Override
	public List<DebateTopicSimple> selectAlldebateAttentioned(int id) {
		return debatetopicMapper.selectAlldebateAttentioned(id);
	}

}
