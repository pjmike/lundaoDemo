package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.DebateTopicSimple;
import com.pjmike.lundao.po.ThesisSimple;

public interface UserAttentionService {
	//返回一个用户所关注的论点
    List<ThesisSimple> selectAllThesisAttentioned(int id);
    List<DebateTopicSimple> selectAlldebateAttentioned(int id);
}
