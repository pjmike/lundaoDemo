package com.pjmike.lundao.service.Impl;

import static org.junit.Assert.*;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pjmike.lundao.po.User;

public class UserServiceImplTest {

	private ApplicationContext applicationContext;
	@org.junit.Before
	public void Before() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void testUpdateUserById() throws Exception {
		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		User user = new User();
		user.setMobile("4654565");
		user.setGender("famale");
		User user2 = userServiceImpl.updateUserById(user);
		System.out.println(user2);
	}

}
