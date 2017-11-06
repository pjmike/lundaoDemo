package com.pjmike.lundao.util;

import java.util.UUID;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 通过redis存储和验证Token
 * @author pjmike
 *
 */
@Component
public class RedisTokenManager implements TokenManager {
	
	@SuppressWarnings("rawtypes")
	private RedisTemplate redisTemplate; 
	public void setRedisTemplate(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	@SuppressWarnings("unchecked")
	@Cacheable(value="tokenCache",key="#result.token")
	@Override
	public TokenModel createToken(int userid) {
		String token = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(token);
		TokenModel tokenmodel = new TokenModel(userid, token);
//		redisTemplate.opsForValue().set(userid, token);
		return tokenmodel;
	}

	@Override
	public boolean checkToken(TokenModel model) {
		if (model == null) {
			return false;
		}
		String token = (String) redisTemplate.opsForValue().get(model.getUserid());
		if (token == null || !token.equals(model.getToken())) {
			return false;
		}
		return true;
	}

	@Override
	public TokenModel getToken(String authentication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteToken(int userid) {
		redisTemplate.delete(userid);
	}
}
