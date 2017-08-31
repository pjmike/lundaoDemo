package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    

    int deleteByPrimaryKey(Integer id);

    int insert(Reply record);

    int insertSelective(Reply record);

    //添加回复
    int insert(User user,Reply reply);
    
    
  //返回一个辩题的点赞数
    int likeNumber(int id);
    //是否点赞
    Integer Islike(@Param("r_uid")int id,@Param("r_replyid")int replyid);
    //点赞
    int insetLike(@Param("r_uid")int id,@Param("r_replyid")int replyid);
    //取消点赞
    int giveupLike(@Param("r_uid")int id,@Param("r_replyid")int replyid);

    
    List<ReplyExtend> select(Integer id);

    ReplyExtend selectbyReplyid(Integer id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);
    
    //发起回复
    int reply(Reply reply);
    
    //插入已经点击过的【评论
    int storeAlreadyClick(ReplyExtend reply);
    
    List<ReplyExtend> selectAleadyClick();
    //删除不喜欢的回复
    int changereplyIsShow(@Param("userid")int id,@Param("reply")int replyid);
    //查看Isshow的状态
    Integer selectIsShow(@Param("userid")int id,@Param("reply")int replyid);
    
}