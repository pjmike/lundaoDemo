package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.DebatetopicExample;
import com.pjmike.lundao.po.Debatetopicextend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebatetopicMapper {


    int deleteByPrimaryKey(Integer topicid);

    int insert(Debatetopic record);

    int insertSelective(Debatetopic record);


    
    List<Debatetopicextend> selectList();
    List<Debatetopic> selectListby();
    
    //返回一个辩题的点赞数
    int likeNumber(int id);
    
    //判断是否点赞
    int Islike(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    //判断是否关注
    int IsAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    //点赞
    int insetLike(@Param("user_id")int id,@Param("debate_id")int topicId);
    //取消点赞
    int giveupLike(@Param("user_id")int id,@Param("debate_id")int topicId);
    //查找一个辩题下所有论点
    Debatetopicextend selectByPrimaryKey(@Param("topicid") Integer id);

    //取消关注
    int deleteAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    //关注辩题
    int insertAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    
    
    int updateByPrimaryKeySelective(Debatetopic record);
    int updateByPrimaryKeyWithLike(Debatetopic record);

    int updateByPrimaryKey(Debatetopic record);
//    updateClick
    int updateClick(Debatetopic record);
}