package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Quescondition;
import com.pjmike.lundao.po.QuesconditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuesconditionMapper {
    int countByExample(QuesconditionExample example);

    int deleteByExample(QuesconditionExample example);

    int deleteByPrimaryKey(Integer quesid);

    int insert(Quescondition record);

    int insertSelective(Quescondition record);

    List<Quescondition> selectByExample(QuesconditionExample example);

    Quescondition selectByPrimaryKey(Integer quesid);

    int updateByExampleSelective(@Param("record") Quescondition record, @Param("example") QuesconditionExample example);

    int updateByExample(@Param("record") Quescondition record, @Param("example") QuesconditionExample example);

    int updateByPrimaryKeySelective(Quescondition record);

    int updateByPrimaryKey(Quescondition record);
}