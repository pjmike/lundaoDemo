package com.pjmike.lundao.configuration;

import java.lang.reflect.Method;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class CachingConfig {
	/**
	 * 连接redis
	 * @return
	 */
	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		//设置host地址
		jedisConnectionFactory.setHostName("47.94.89.241");
		//设置端口
		jedisConnectionFactory.setPort(6379);
		//在属性后设置???
		jedisConnectionFactory.afterPropertiesSet();
		return jedisConnectionFactory;
	}
	/**
	 * redisTemplate bean
	 * @param redisCF
	 * @return
	 */
	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisCF) {
		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object,Object>();
		redisTemplate.setConnectionFactory(redisCF);
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
		redisTemplate.setKeySerializer(new Jackson2JsonRedisSerializer<>(Object.class));
		redisTemplate.setHashKeySerializer(new Jackson2JsonRedisSerializer<>(Object.class));
		redisTemplate.setHashValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
		
	}
	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
		return redisCacheManager;
	}
	/**
	 * 自定义缓存key策略
	 * @return
	 */
	@Bean
	public KeyGenerator customKeyGenerator() {
		return new KeyGenerator() {
			@Override
			public Object generate(Object arg0, Method arg1, Object... arg2) {
				StringBuilder sb = new StringBuilder();
				sb.append(arg0.getClass().getName());
				sb.append(arg1.getName());
				for (Object object : arg2) {
					sb.append(object.toString());
				}
				return sb.toString();
			}
		};
	}
}
