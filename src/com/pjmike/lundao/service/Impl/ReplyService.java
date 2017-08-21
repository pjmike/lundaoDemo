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
    int insetLike(User user,int replyid);
    //取消点赞
    int giveupLike(User user,int replyid);
    //发起回复
    int reply(Reply reply);
}
