package com.pjmike.lundao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.AttentionOther;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.User2;
import com.pjmike.lundao.po.UserCustom;

/**
 * UserMapper接口，结合UserMapper.xml文件对数据库进行操作
 * @author pjmike
 *
 */


public interface UserMapper {
	//更新用户信息
	public int updateUser(User user) throws Exception;
	
	
	//保存用户的头像与用户名 
	public int insertUser(User user);
	
	//根据用户id查询用户头像与nickname 
	public User selectNicknameAndIcon(int id);
	
	public User selectUser(String openid);
	
	public User findUserBymobile(long mobile);
	//保存用户的手机号和密码
	public int insertUserbyMobile(User user);
	
	public User findUserById(int id);
	public int updateUserInformation(User user);
	//查询出一个用户所关注的辩题数
	public Integer findAttentionDebateNumber(int id);
	
	public Integer findAttentionThesisNumber(int id);
	
	public Integer findAskquestionNumber(int id);
	
	public Integer findReplyNumber(int id);
	
	public UserCustom findUser(int id);
	
	public int AttentionOther(@Param("from_uid")int fromUid,@Param("to_uid")int toUid);
	
	public int AttentionedPeople(@Param("from_uid")int fromUid,@Param("to_uid")int toUid);
	
	public Integer AttentionedOtherPeople(int id);
	
	public Integer myFans(int id);
	
	public int updateAttentionPeopleStatus(AttentionOther user);
	
	public List<User> selectMyUserFormotion(int id);
	
	public List<AskquestionExtend> selectMyReplyes(int id);
	
	public List<Thesis> selectMyThesis(int id);
	
	public List<Debatetopic> selectMyDebate(int id);
}
