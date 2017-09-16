package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ThesisMapper;

@Service
public class TheisAttentionSerivceImpl implements TheisAttentionSerivce {
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public int AaginAttentioned(int id, int thesisid) {
		return thesisMapper.AaginAttentioned(id, thesisid);
	}

	@Override
	public Integer selectAttentioned(int id, int thesisid) {
		return thesisMapper.selectAttentioned(id, thesisid);
	}

	@Override
	public int insertAttention(int id, int thesisid) {
		return thesisMapper.insertAttention(id, thesisid);
	}

	@Override
	public int deleteAttention(int id, int thesisid) {
		return thesisMapper.deleteAttention(id, thesisid);
	}

}
