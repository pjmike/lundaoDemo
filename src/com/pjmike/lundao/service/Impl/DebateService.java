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
   public List<Debatetopic> selectListByPage(User user,int currPage,int pageSize);
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
   //取消关注
   int deleteAttention(Integer topicid,int id);
   //查看是否存在点赞
   Integer findIshasLike(Integer topicid,int id);
   //再次点赞
   int Likeagain(Integer topicid,int id);
   
   //查看是否存在关注
   Integer findisHasAttention(Integer topicid,int id);
   //再次关注
   int Attentionagain(Integer topicid,int id);
   
   List<Debatetopic> selectAlldebateAttentioned(int id);
   //用户是否点赞
   Integer Islike(Integer topicid,int id);
   
   //用户是否关注
   Integer  IsAttention(Integer topicid,int id);
}
