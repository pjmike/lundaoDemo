package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExample;
import com.pjmike.lundao.po.ThesisExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesisMapper {
	
    int deleteByPrimaryKey(Integer thesisid);
    //增加论点
    int insert(Thesis record);
    
    int insertSelective(Thesis record);
    
    List<Thesis> selectBykey();
    

    
    ThesisExtend selectBythesisId (int id);


    int updateByPrimaryKey(Thesis record);
}