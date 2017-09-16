package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisCollection;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;
import com.pjmike.lundao.po.User;

public interface ThesisService {
	public ThesisExtend selectBythesisId(int id,User user,int currPage,int pageSize);
	
	 //增加论点
    int insert(Thesis record);
    //查询某一个辩题
    Thesis selectOne(int id);
    //关注辩题
    int insertAttention(Integer thesisId,User user);
    //取消点赞
    int deleteAttention(Integer thesisId,User user);
    //收藏论点
    int collectionThesis(Integer thesisId,int id);
    /**
	 * 提交论点完善版本
	 * @param supplement
	 * @return
	 */
	int insertsupplement(Supplement supplement);
	
	 //返回所有的完善版本
    List<ThesisSupplement> selectAllSupplement(Supplement supplement);
    
    List<ThesisCollection> selectAllCollectionThesis(int id);
    AskquestionExtend selectReply(ReplyExtend it,User user);
    
    int updateColleThesisIsshow(int userid,int thesisId);

	ThesisExtend selectBythesisId(int id, User user);
}
