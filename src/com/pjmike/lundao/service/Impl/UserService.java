package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.User;

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
		
		
	//保存用户的头像与用户名 和id
	public int insertUser(User user);
	
	//根据用户id查询用户头像与nickname 
	public User selectNicknameAndIcon(int id);
	
	public User selectUser(String openid);
	//验证用户
	public User findUserByname(String nickname);
}
