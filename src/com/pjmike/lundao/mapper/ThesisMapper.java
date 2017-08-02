package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesisMapper {
    int countByExample(ThesisExample example);

    int deleteByExample(ThesisExample example);

    int deleteByPrimaryKey(Integer thesisid);

    int insert(Thesis record);

    int insertSelective(Thesis record);
    List<Thesis> selectBykey();
    
    List<Thesis> selectByExampleWithBLOBs(ThesisExample example);

    List<Thesis> selectByExample(ThesisExample example);

    Thesis selectByPrimaryKey(Integer thesisid);

    int updateByExampleSelective(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByExampleWithBLOBs(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByExample(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByPrimaryKeySelective(Thesis record);

    int updateByPrimaryKeyWithBLOBs(Thesis record);

    int updateByPrimaryKey(Thesis record);
}