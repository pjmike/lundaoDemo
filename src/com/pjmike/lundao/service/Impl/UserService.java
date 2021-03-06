package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.AttentionOther;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.po.UserFans;
import com.pjmike.lundao.po.UserSelected;

public interface UserService {
	/*public int addUser(User2 user) throws Exception ;
	public User2 checkLogin(String username, String password) throws Exception;*/
	
	
	/*public int addUser(User user) throws Exception;
	public User checkLogin(String mobile, String password) throws Exception;
	public User findUserBymobile(String mobile) throws Exception;
	public User findUserById(int id) throws Exception;
	public User updateUserById(User user) throws Exception;*/
	
	
	
	//更新用户信息
	public int updateUser(User user) throws Exception;
	//保存用户的手机号和密码
	public int insertUserbyMobile(User user);
		
		
	//保存用户的头像与用户名 和id
	public int insertUser(User user);
	
	//根据用户id查询用户头像与nickname 
	public User selectNicknameAndIcon(int id);
	
	public User selectUser(String openid);
	//验证用户
	public User findUserBymobile(long mobile);
	//根据用户id查找
	public User findUserById(int id);
	
	public int updateUserInformation(User user);
	
//	@Cacheable()
	public UserCustom findUser(int fromUid,int toUid);
	
	public int AttentionOther(int fromUid,int toUid);
	
	public Integer AttentionedOtherPeople(int id);
	
	public Integer myFans(int id);
	
	public int updateAttentionPeopleStatus(AttentionOther user);
	
	public int AttentionedPeople(int fromUid,int toUid);
	
	public List<User> selectMyUserFormotion(int id);
	public List<AskquestionExtend> selectMyReplyes(int id);
	
	public List<Thesis> selectMyThesis(int id);
	
	public List<Debatetopic> selectMyDebate(int id);
	//返回我的粉丝的信息
	public List<UserFans> findmyFansInformation(int id);
	//上传本地图片
	public int updateUserIcon(@Param("Icon")String Icon,@Param("id")int id);
	//模糊查询用户
	public List<UserSelected> selectUsersByString(String value);
		
}
