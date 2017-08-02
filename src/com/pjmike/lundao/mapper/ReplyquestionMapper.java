package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Replyquestion;
import com.pjmike.lundao.po.ReplyquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyquestionMapper {
    int countByExample(ReplyquestionExample example);

    int deleteByExample(ReplyquestionExample example);

    int deleteByPrimaryKey(Integer replyquesid);

    int insert(Replyquestion record);

    int insertSelective(Replyquestion record);

    List<Replyquestion> selectByExampleWithBLOBs(ReplyquestionExample example);

    List<Replyquestion> selectByExample(ReplyquestionExample example);

    Replyquestion selectByPrimaryKey(Integer replyquesid);

    int updateByExampleSelective(@Param("record") Replyquestion record, @Param("example") ReplyquestionExample example);

    int updateByExampleWithBLOBs(@Param("record") Replyquestion record, @Param("example") ReplyquestionExample example);

    int updateByExample(@Param("record") Replyquestion record, @Param("example") ReplyquestionExample example);

    int updateByPrimaryKeySelective(Replyquestion record);

    int updateByPrimaryKeyWithBLOBs(Replyquestion record);

    int updateByPrimaryKey(Replyquestion record);
}