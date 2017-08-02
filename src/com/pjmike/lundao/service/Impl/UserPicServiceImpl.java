package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.UserPicMapper;
import com.pjmike.lundao.po.UserIcon;

@Service
public class UserPicServiceImpl implements UserPicService{
	
	@Autowired
	private UserPicMapper userPicMapper;
	@Override
	public int addUserIcon(UserIcon userIcon) {
		return userPicMapper.addUserIcon(userIcon);
		
	}

	@Override
	public int addUserBackIcon(UserIcon userIcon) {
		return userPicMapper.addUserBackIcon(userIcon);
	}

	@Override
	public void updateIcon(UserIcon userIcon) {
		userPicMapper.addUserIcon(userIcon);
		
	}

	@Override
	public void updateBackIcon(UserIcon userIcon) {
		userPicMapper.addUserBackIcon(userIcon);
	}
}
