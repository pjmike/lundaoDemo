package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;

public interface AskquesService {
	 int insertaskquestion(Askquestion askquestion);
	  //返回一个辩题的点赞数
	    int likeNumber(int id);
	    
	    //判断是否点赞
	    int Islike(comvote comvote);
	    
	    //点赞
	    int insetLike(comvote comvote);
	    //取消点赞
	    int giveupLike(comvote comvote);

	    //取消关注
	    int deleteAttention(User user,int askid);
	    
	    //关注辩题
	    int insertAttention(User user,int askid);
	    
	    //判断是否关注
	    int IsAttention(User user,int askid);
	    
	    AskquestionExtend findReply(ReplyExtend it,User user);
	    
	    //返回所关注的提问及异议
	    List<AskquAttention> selecrAllAttentionAskqustion(int id);
	    
	    int changeIsShow(int id,int askid);
	    
	    Integer SeeIsShow(int id,int askid);
}
