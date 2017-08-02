package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;

/*
 * @author pjmike
 * 辩题查询添加等服务
 */
public interface DebateService {
	//根据主键查询辩题
   public Debatetopic selectByPrimaryKey(Integer topicid);
   //查询辩题下的论点
   public List<Thesis> selectBykey();
   //跟新辩题的关注量
   public int updateByPrimaryKey(Debatetopic record,User user);
   //更新辩题的点赞量
   public int updateByPrimaryKeyWithLike(Debatetopic record);
   
   //获取全部辩题
   public List<Debatetopicextend> selectList();
   
   //获取全部辩题不带论点
   public List<Debatetopic> selectListby();
}
