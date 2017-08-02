package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.UserIcon;

public interface UserPicMapper {
	public int addUserIcon(UserIcon userIcon);
	public int addUserBackIcon(UserIcon userIcon);
	public void updateIcon(UserIcon userIcon);
	public void updateBackIcon(UserIcon userIcon);
} 
