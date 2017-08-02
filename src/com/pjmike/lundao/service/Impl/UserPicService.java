package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.UserIcon;

public interface UserPicService {
	public int addUserIcon(UserIcon userIcon);
	public int addUserBackIcon(UserIcon userIcon);
	public void updateIcon(UserIcon userIcon);
	public void updateBackIcon(UserIcon userIcon);
}
