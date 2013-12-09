package com.tiemei.demo.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * http://www.mkyong.com/spring3/spring-aop-aspectj-annotation-example/
 *
 * @author tiemei.jdk
 * @date   2012-11-28
 */
@Aspect
public class LoggingAspect {
	@Before("execution(* com.tiemei.demo.spring.aop.*.*Bo.addCustomer(..))")
	public void interfaceBefore(JoinPoint joinPoint) {
 
		System.out.println("before method : " + joinPoint.getSignature().getName());
	}
	
	
	@Before("execution(* com.tiemei.demo.spring.aop.base.BaseClass.methodInBaseClass(..))")
	public void baseClassBefore(JoinPoint joinPoint) {
 
		System.out.println("before method : " + joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.tiemei.demo.spring.aop.base.BaseClass.abstractMethodInBaseClass(..))")
	public void abstractClassBefore(JoinPoint joinPoint) {
 
		System.out.println("before method : " + joinPoint.getSignature().getName());
	}
	
	
}
