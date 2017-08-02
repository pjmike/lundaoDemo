package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Replyask;
import com.pjmike.lundao.po.ReplyaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyaskMapper {
    int countByExample(ReplyaskExample example);

    int deleteByExample(ReplyaskExample example);

    int deleteByPrimaryKey(Integer replyakdid);

    int insert(Replyask record);

    int insertSelective(Replyask record);

    List<Replyask> selectByExampleWithBLOBs(ReplyaskExample example);

    List<Replyask> selectByExample(ReplyaskExample example);

    Replyask selectByPrimaryKey(Integer replyakdid);

    int updateByExampleSelective(@Param("record") Replyask record, @Param("example") ReplyaskExample example);

    int updateByExampleWithBLOBs(@Param("record") Replyask record, @Param("example") ReplyaskExample example);

    int updateByExample(@Param("record") Replyask record, @Param("example") ReplyaskExample example);

    int updateByPrimaryKeySelective(Replyask record);

    int updateByPrimaryKeyWithBLOBs(Replyask record);

    int updateByPrimaryKey(Replyask record);
}