package com.pjmike.lundao.aop;

import org.apache.logging.log4j.core.config.Order;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.pjmike.lundao.tool.DataSourceContextHolder;

@Aspect
@Component
@Order(1)
public class DataSourceInterceptor {
	
	@Pointcut("execution(public * com.pjmike.lundaoTaoti.service.Impl.*.*(..))")
	public void dataSourceLundaoTaoti() {}
	
	@Before("dataSourceLundaoTaoti()")
	public void before(JoinPoint jp) {
		DataSourceContextHolder.set("LundaoTaoti");
	}
	
	@After("execution(public * com.pjmike.lundaoTaoti.service.Impl.*.*(..))")
	public void removeDatasource(JoinPoint joinPoint) {
		DataSourceContextHolder.reset();
	}
}
