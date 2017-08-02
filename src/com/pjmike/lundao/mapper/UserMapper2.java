package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.User;

public interface UserMapper2 {
	public User findUserBymobile(String mobile) throws Exception;
	public int addUser(User user) throws Exception;
	public User findUserById(int id) throws Exception;
	public User updateUserById(User user) throws Exception;
}
