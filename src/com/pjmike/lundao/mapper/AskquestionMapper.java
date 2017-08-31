package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.comvote;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AskquestionMapper {

    int deleteByPrimaryKey(Integer id);

    int insertaskquestion(Askquestion askquestion);

    int insertSelective(Askquestion record);

    Askquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Askquestion record);

    AskquestionExtend selectOneAskquestion(int id);
    int updateByPrimaryKey(Askquestion record);
    
    List<AskquAttention> selecrAllAttentionAskqustion(int id);
    
    //返回一个辩题的点赞数
    int likeNumber(int id);
    
    //判断是否点赞
    Integer Islike(comvote comvote);
    
    //判断是否关注
    Integer IsAttention(@Param("user_id")int id,@Param("ask_id")int askid);
    //点赞
    int insetLike(comvote comvote);
    //取消点赞
    int giveupLike(comvote comvote);

    //取消关注
    int deleteAttention(@Param("user_id")int id,@Param("ask_id")int askid);
    
    //删除提问或异议
    int changeIsShow(@Param("userid")int id,@Param("askid")int askid);
    
    Integer SeeIsShow(@Param("userid")int id,@Param("askid")int askid);
    //关注辩题
    int insertAttention(@Param("user_id")int id,@Param("ask_id")int askId);
}