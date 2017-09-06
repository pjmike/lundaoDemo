package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DebatetopicMapper {


    int deleteByPrimaryKey(Integer topicid);

    int insert(Debatetopic record);

    int insertSelective(Debatetopic record);


    
    List<Debatetopicextend> selectList();
    List<Debatetopic> selectListByPage(Map<String, Object> data);
    
    /**返回用户关注的辩题
     * @param id
     * @return
     */
    List<Debatetopic> selectAlldebateAttentioned(int id);
    //返回一个辩题的点赞数
    int likeNumber(int id);
    //返回一个辩题的关注量
    Integer AttentionNumber(int id);
    //判断是否点赞
    Integer Islike(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    //判断是否关注
    Integer IsAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    //查看是否存在点赞
    Integer findIshasLike(@Param("user_id")int id,@Param("debate_id")int topicId);
    //点赞
    int insetLike(@Param("user_id")int id,@Param("debate_id")int topicId);
    //取消点赞
    int giveupLike(@Param("user_id")int id,@Param("debate_id")int topicId);
    //再次点赞
    int Likeagain(@Param("user_id")int id,@Param("debate_id")int topicId);
    //查找一个辩题下所有论点
    Debatetopicextend selectByPrimaryKey(@Param("topicid") Integer id);
    //查看是否存在关注
    Integer findisHasAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    //取消关注
    int deleteAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    //关注辩题
    int insertAttention(@Param("user_id")int id,@Param("debate_id")int topicId);
    //再次关注
    int Attentionagain(@Param("user_id")int id,@Param("debate_id")int topicId);
    
    
    
    int updateByPrimaryKeySelective(Debatetopic record);
    int updateByPrimaryKeyWithLike(Debatetopic record);

    int updateByPrimaryKey(Debatetopic record);
//    updateClick
    int updateClick(Debatetopic record);
}