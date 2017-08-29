package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesisMapper {
	
    int deleteByPrimaryKey(Integer thesisid);
    //增加论点
    int insert(Thesis record);
    
    int insertSelective(Thesis record);
    
    List<Thesis> selectBykey();
    

    //查询某一个辩题
    Thesis selectOne(int id);
    ThesisExtend selectBythesisId (int id);
    //返回一个论点的关注数
    
    int attentionNum(int id);
    //返回一个论点的点赞数、
    int likeNumber(int id);
    //返回一个用户所关注的论点
    List<Thesis> selectAllThesisAttentioned(int id);

    int updateByPrimaryKey(Thesis record);
    //判断是否点赞
    int Islike(@Param("t_uid")int id,@Param("t_thesisid")int thesisid);
    
    //判断是否关注
    int IsAttention(@Param("user_id")int id,@Param("thesis_id")int t_thesisid);

    //取消关注
    int deleteAttention(@Param("user_id")int id,@Param("thesis_id")int thesisid);
    
    //关注辩题
    int insertAttention(@Param("user_id")int id,@Param("debate_id")int thesisid);
    
    //收藏论点
    int collectionThesis(@Param("user_id")int id,@Param("debate_id")int thesisid);
    //返回所有的完善版本
    List<ThesisSupplement> selectAllSupplement(Supplement supplement);
    
    List<Thesis> selectAllCollectionThesis(int id);
}
