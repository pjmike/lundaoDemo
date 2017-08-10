package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskquestionMapper {
    int countByExample(AskquestionExample example);

    int deleteByExample(AskquestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insertaskquestion(Askquestion askquestion);

    int insertSelective(Askquestion record);

    List<Askquestion> selectByExample(AskquestionExample example);

    Askquestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Askquestion record, @Param("example") AskquestionExample example);

    int updateByExample(@Param("record") Askquestion record, @Param("example") AskquestionExample example);

    int updateByPrimaryKeySelective(Askquestion record);

    int updateByPrimaryKey(Askquestion record);
}