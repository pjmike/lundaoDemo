package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Askcondition;
import com.pjmike.lundao.po.AskconditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskconditionMapper {
    int countByExample(AskconditionExample example);

    int deleteByExample(AskconditionExample example);

    int deleteByPrimaryKey(Integer askcdid);

    int insert(Askcondition record);

    int insertSelective(Askcondition record);

    List<Askcondition> selectByExample(AskconditionExample example);

    Askcondition selectByPrimaryKey(Integer askcdid);

    int updateByExampleSelective(@Param("record") Askcondition record, @Param("example") AskconditionExample example);

    int updateByExample(@Param("record") Askcondition record, @Param("example") AskconditionExample example);

    int updateByPrimaryKeySelective(Askcondition record);

    int updateByPrimaryKey(Askcondition record);
}