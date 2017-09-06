package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ThesisMapper;

@Service
public class AttentionServiceImpl implements AttentionService {
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public Integer IsAttention(int id, int thesisid) {
		return thesisMapper.IsAttention(id, thesisid);
	}

}
