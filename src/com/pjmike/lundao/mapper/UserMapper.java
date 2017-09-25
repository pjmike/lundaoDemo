package com.pjmike.lundao.mapper;


import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.User2;

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
	
	public User findUserByname(String nickname);
	
}
