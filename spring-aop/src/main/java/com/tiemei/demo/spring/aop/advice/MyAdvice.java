package com.tiemei.demo.spring.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 用到cglib
 * http://www.mkyong.com/spring/spring-aop-examples-advice/
 *
 * @author tiemei.jdk
 * @date   2012-11-28
 */
public class MyAdvice implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor { // 还有 ThrowsAdvice 
	
	public void before(Method method, Object[] args, Object target) throws Throwable {
	    System.out.println("before");
    }

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after");
    }

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("around before");
		invocation.proceed();
		System.out.println("around after");
	    return null;
    }
	
	
}
