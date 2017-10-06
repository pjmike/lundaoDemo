package com.pjmike.lundao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.UserMapper;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserMapper userMapper;
	@Override
	public int updateUser(User user) throws Exception {
		
		return userMapper.updateUser(user);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}
	
	//根据id返回用户头像和nickname
	@Override
	public User selectNicknameAndIcon(int id) {
		return userMapper.selectNicknameAndIcon(id);
	}

	@Override
	public User selectUser(String openid) {
		return userMapper.selectUser(openid);
	}

	@Override
	public User findUserBymobile(int mobile) {
		User user = userMapper.findUserBymobile(mobile);
		return user;
	}

	@Override
	public int insertUserbyMobile(User user) {
		return userMapper.insertUserbyMobile(user);
	}

	@Override
	public User findUserById(int id) {
		return userMapper.findUserById(id);
	}

	@Override
	public int updateUserInformation(User user) {
		return userMapper.updateUserInformation(user);
	}
	
	@Override
	public UserCustom findUser(int id) {
		UserCustom userCustom = userMapper.findUser(id);
		Integer myAttentionDebates = userMapper.findAttentionDebateNumber(id);
		Integer myAttentionThesis = userMapper.findAttentionThesisNumber(id);
		Integer myReplys = userMapper.findAskquestionNumber(id);
		Integer fans = userMapper.AttentionedOtherPeople(id);
		userCustom.setMyDebates(myAttentionDebates);
		userCustom.setMyThesis(myAttentionThesis);
		userCustom.setMyReplys(myReplys);
		userCustom.setFans(fans);
		userCustom.setMyAttention(myAttentionThesis+myAttentionDebates);
		return userCustom;
	}

	@Override
	public int AttentionOther(int fromUid, int toUid) {
		return userMapper.AttentionOther(fromUid, toUid);
	}

	@Override
	public Integer AttentionedOtherPeople(int id) {
		return userMapper.AttentionedOtherPeople(id);
	}

	@Override
	public Integer myFans(int id) {
		return userMapper.myFans(id); 
	}

	@Override
	public int updateAttentionPeopleStatus(com.pjmike.lundao.po.AttentionOther user) {
		
		return userMapper.updateAttentionPeopleStatus(user);
	}

	@Override
	public int AttentionedPeople(int fromUid, int toUid) {
		return userMapper.AttentionedPeople(fromUid, toUid);
	}

	@Override
	public List<User> selectMyUserFormotion(int id) {
		return userMapper.selectMyUserFormotion(id);
	}

	
}
