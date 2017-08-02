package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.User;

public interface UserService {
	/*public int addUser(User2 user) throws Exception ;
	public User2 checkLogin(String username, String password) throws Exception;*/
	
	
	public int addUser(User user) throws Exception;
	public User checkLogin(String mobile, String password) throws Exception;
	public User findUserBymobile(String mobile) throws Exception;
	public User findUserById(int id) throws Exception;
	public User updateUserById(User user) throws Exception;
}
