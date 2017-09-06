package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;

public interface UserAttentionService {
	//返回一个用户所关注的论点
    List<Thesis> selectAllThesisAttentioned(int id);
    List<Debatetopic> selectAlldebateAttentioned(int id);
}
