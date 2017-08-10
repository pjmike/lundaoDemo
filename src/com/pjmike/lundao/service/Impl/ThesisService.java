package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;

public interface ThesisService {
	public ThesisExtend selectBythesisId(int id) throws Exception,ClassCastException;
	
	 //增加论点
    int insert(Thesis record);
    
}
