package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.Reply;

public interface ThesisService {
	public List<Reply> selectByPrimaryKey(Integer debateId);
}
