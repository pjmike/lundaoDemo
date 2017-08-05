package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.Thesis;

public interface ThesisService {
	public Thesis selectBythesisId(int id) throws Exception,ClassCastException;
}
