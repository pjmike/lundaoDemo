package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;

public interface AskquesService {

	int insertaskquestion(Askquestion askquestion);

	int likeNumber(int id);

	int Islike(comvote comvote);

	int insetLike(comvote comvote);

	int giveupLike(comvote comvote);
	int AaginLike(comvote comvote);
    int selectLike(comvote comvote);
	int deleteAttention(int id, int askid);

	int insertAttention(int id, int askid);
	int AaginAttention(int id,int askid);
    
    int selectAttention(int id,int askid);
	int IsAttention(User user, int askid);

	AskquestionExtend findReply(ReplyExtend it, User user);

	List<AskquAttention> selecrAllAttentionAskqustion(int id);

	int changeIsShow(int id, int askid);

	Integer SeeIsShow(int id, int askid);
	
    //查询提问及异议的内容
    String selectContent(int id);

}
