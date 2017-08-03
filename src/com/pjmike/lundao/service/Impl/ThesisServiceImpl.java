package com.pjmike.lundao.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.ThesisExtend;

@Service
public class ThesisServiceImpl implements ThesisService {
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public ThesisExtend selectBythesisId(int id) {
		return thesisMapper.selectBythesisId(id);
		
	}
	

}
