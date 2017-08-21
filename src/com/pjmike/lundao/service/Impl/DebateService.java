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
   public Debatetopicextend selectByPrimaryKey(Integer topicid,User user);
   //查询辩题下的论点
   public List<Thesis> selectBykey();
   //跟新辩题的关注量
   public int updateByPrimaryKey(Debatetopic record,User user);
   //更新辩题的点赞量
   public int updateByPrimaryKeyWithLike(Debatetopic record);
   
   //获取全部辩题
   public List<Debatetopicextend> selectList();
   
   //获取全部辩题不带论点
   public List<Debatetopic> selectListby(User user);
   //获取全部辩题不带论点
   public List<Debatetopic> selectListNoUser();
   
   //更新点赞量
   public int updateClick(Debatetopic record);
   //点赞操作
   public int insetLike(Integer topicid,int id);
   //取消点赞
   public int giveupLike(Integer topicid,int id);
   //关注辩题
   int insertAttention(Integer topicid,int id);
   //取消点赞
   int deleteAttention(Integer topicid,int id);
}
