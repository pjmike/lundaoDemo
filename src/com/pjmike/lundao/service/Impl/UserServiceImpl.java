package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.UserMapper;
import com.pjmike.lundao.mapper.UserMapper2;
import com.pjmike.lundao.po.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper2 userMapper2;
	
	@Override
	public int addUser(User user) throws Exception {
		return userMapper2.addUser(user);
	}

	@Override
	public User checkLogin(String mobile, String password) throws Exception {
		User user = userMapper2.findUserBymobile(mobile);
		if(null!=user && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	public User findUserBymobile(String mobile) throws Exception {
		User user = userMapper2.findUserBymobile(mobile);
		return user;
	}

	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		User user = userMapper2.findUserById(id);
		return user;
	}

	@Override
	public User updateUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		user = userMapper2.updateUserById(user);
		return user;
	}

	
	
	
	/*@Autowired
	private UserMapper userMapper;
	
		public int addUser(User2 user) throws Exception {
			return userMapper.addUser(user);
		}

		@Override
		public User2 checkLogin(String username, String password) throws Exception {
			// TODO Auto-generated method stub
			User2  user = userMapper.findUserByName(username);
			
			if (user!=null && password.equals(user.getPassword())) {
				return user;
			}
			return null;
		}
*/

}
