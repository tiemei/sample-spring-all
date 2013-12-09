package com.tiemei.demo.spring.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class TopAspect {
	@Around("@annotation(com.tiemei.demo.spring.aop.anno.TopBefore)")
	public void topBefore(ProceedingJoinPoint pjp, TopBefore topBefore) throws Throwable {
		System.out.println("before");
		pjp.proceed();
	}
}
