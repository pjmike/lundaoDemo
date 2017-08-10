package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.ReplyExample;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(Reply record);

    int insertSelective(Reply record);

    //添加回复
    int insert(User user,Reply reply);
    
    List<ReplyExtend> select(Integer id);

    ReplyExtend selectbyReplyid(Integer id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);
}