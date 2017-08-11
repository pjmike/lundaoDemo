package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.User;

public interface ThesisService {
	public ThesisExtend selectBythesisId(int id) throws Exception,ClassCastException;
	
	 //增加论点
    int insert(Thesis record);
    //查询某一个辩题
    Thesis selectOne(int id);
    //关注辩题
    int insertAttention(Integer thesisId,User user);
    //取消点赞
    int deleteAttention(Integer thesisId,User user);
    
}
