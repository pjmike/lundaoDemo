package com.pjmike.lundao.service.Impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.UserMapper;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.PeriodicalItemList;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.po.UserFans;
import com.pjmike.lundao.po.UserSelected;
import com.pjmike.lundao.util.SerializeUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class UserServiceImpl implements UserService {
	private Jedis jedis = new Jedis("47.94.89.241", 6379);
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	JedisPool jedisPool;
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

	@Cacheable("userCache")
	@Override
	public User findUserBymobile(long mobile) {
		User user = userMapper.findUserBymobile(mobile);
		return user;
	}

	@Override
	public int insertUserbyMobile(User user) {
		return userMapper.insertUserbyMobile(user);
	}
	@Cacheable("userCache")
	@Override
	public User findUserById(int id) {
		return userMapper.findUserById(id);
	}

	@Override
	public int updateUserInformation(User user) {
		return userMapper.updateUserInformation(user);
	}
	/**
	 * fromUid为登录者id,toUid为获取用户信息的Id
	 */
	@Override
	public UserCustom findUser(int fromUid,int toUid) {
		com.pjmike.lundao.po.AttentionOther user = new com.pjmike.lundao.po.AttentionOther();
		user.setFrom_uid(fromUid);
		user.setTo_uid(toUid);
//		UserCustom userCustom = userMapper.findUser(id);
		UserCustom userCustom = null;
		//使用jedis实现用户信息的redis缓存
		Jedis jedis = jedisPool.getResource();
		String userRedisKey = "user:"+toUid;
		String value = jedis.get(userRedisKey);
		if (value != null) {
			userCustom = (UserCustom) SerializeUtil.deserialize(value);
		} else {
		  userCustom = userMapper.findUser(user);
		  if (userCustom != null) {
			  jedis.setex(userRedisKey, 3000, SerializeUtil.serialize(userCustom));
		  }
		}
//		 userCustom = userMapper.findUser(user);
/*		if (userMapper.findUserStatus(fromUid, toUid)) {
			
		}*/
//		boolean status = userMapper.findUserStatus(fromUid, toUid);
		
		Integer myAttentionDebates = userMapper.findAttentionDebateNumber(toUid);
		if (myAttentionDebates != null) {
			userCustom.setDebateTopic(myAttentionDebates);
		}
		Integer myAttentionThesis = userMapper.findAttentionThesisNumber(toUid);
		if (myAttentionThesis != null) {
			userCustom.setThesis(myAttentionThesis);
		}
		
		Integer myReplys = userMapper.findAskquestionNumber(toUid);
		if (myReplys != null) {
			userCustom.setPresentations(myReplys);
		}
		Integer fans = userMapper.AttentionedOtherPeople(toUid);
		if (fans != null) {
			userCustom.setFansAmounts(fans);
		}
		List<PeriodicalItemList> list = new ArrayList<PeriodicalItemList>();
		PeriodicalItemList p = new PeriodicalItemList();
		p.setId(1);
		p.setUrl("http://osvtz719h.bkt.clouddn.com/springmvc%E4%B9%8Bservlet.png");
		p.setTextContent("spring to serlvet");
		list.add(p);
		userCustom.setPeriodicalItemList(list);
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

	@Override
	public List<AskquestionExtend> selectMyReplyes(int id) {
		return userMapper.selectMyReplyes(id);
	}

	@Override
	public List<Thesis> selectMyThesis(int id) {
		return userMapper.selectMyThesis(id);
	}

	@Override
	public List<Debatetopic> selectMyDebate(int id) {
		return userMapper.selectMyDebate(id);
	}

	@Override
	public List<UserFans> findmyFansInformation(int id) {
		return userMapper.findmyFansInformation(id);
	}
	/**
	 * 上传本地图片
	 */
	@Override
	public int updateUserIcon(String Icon, int id) {
		return userMapper.updateUserIcon(Icon, id);
	}
	/**
	 * 模糊查询用户
	 */
	@Override
	public List<UserSelected> selectUsersByString(String value) {
		return userMapper.selectUsersByString(value);
	}
}
