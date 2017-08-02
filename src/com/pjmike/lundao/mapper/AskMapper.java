package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Ask;
import com.pjmike.lundao.po.AskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskMapper {
    int countByExample(AskExample example);

    int deleteByExample(AskExample example);

    int deleteByPrimaryKey(Integer askid);

    int insert(Ask record);

    int insertSelective(Ask record);

    List<Ask> selectByExample(AskExample example);

    Ask selectByPrimaryKey(Integer askid);

    int updateByExampleSelective(@Param("record") Ask record, @Param("example") AskExample example);

    int updateByExample(@Param("record") Ask record, @Param("example") AskExample example);

    int updateByPrimaryKeySelective(Ask record);

    int updateByPrimaryKey(Ask record);
}