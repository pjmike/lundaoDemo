package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.DebatetopicExample;
import com.pjmike.lundao.po.Debatetopicextend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebatetopicMapper {
    int countByExample(DebatetopicExample example);

    int deleteByExample(DebatetopicExample example);

    int deleteByPrimaryKey(Integer topicid);

    int insert(Debatetopic record);

    int insertSelective(Debatetopic record);

    List<Debatetopic> selectByExampleWithBLOBs(DebatetopicExample example);

    List<Debatetopic> selectByExample(DebatetopicExample example);
    
    List<Debatetopicextend> selectList();
    List<Debatetopic> selectListby();
    
    //返回一个辩题的点赞数
    int likeNumber(int id);
    
    //查找一个辩题下所有论点
    Debatetopicextend selectByPrimaryKey(@Param("topicid") Integer id);

    int updateByExampleSelective(@Param("record") Debatetopic record, @Param("example") DebatetopicExample example);

    int updateByExampleWithBLOBs(@Param("record") Debatetopic record, @Param("example") DebatetopicExample example);

    int updateByExample(@Param("record") Debatetopic record, @Param("example") DebatetopicExample example);

    int updateByPrimaryKeySelective(Debatetopic record);

    int updateByPrimaryKeyWithLike(Debatetopic record);

    int updateByPrimaryKey(Debatetopic record);
}