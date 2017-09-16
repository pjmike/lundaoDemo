package com.pjmike.lundao.service.Impl;


import org.apache.ibatis.annotations.Param;

import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.User;

public interface ReplyService {
	public int insert(User user,Reply reply);
	 //返回一个辩题的点赞数
    int likeNumber(int id);
    //是否点赞
    int Islike(User user,int replyid);
    //点赞
    int insetLike(int userid,int replyid);
    //取消点赞
    int giveupLike(int userid,int replyid);
    
    int AgainLike(int id,int replyid);
    int selectLike(int id,int replyid);
    //发起回复
    int reply(Reply reply);
    //删除不喜欢的回复
    int changereplyIsShow(int id,int replyid);
    
    Integer selectIsShow(int id,int replyid);
}
