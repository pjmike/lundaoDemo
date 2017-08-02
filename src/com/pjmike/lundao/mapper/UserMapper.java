package com.pjmike.lundao.mapper;


import com.pjmike.lundao.po.User2;

/**
 * UserMapper接口，结合UserMapper.xml文件对数据库进行操作
 * @author pjmike
 *
 */


public interface UserMapper {
	
	public User2 findUserByName(String username) throws Exception;
	public int addUser(User2 user) throws Exception;
	public int updateUser(User2 user) throws Exception;
}
