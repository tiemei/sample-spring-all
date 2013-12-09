package com.tiemei.demo.spring.aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyInterceptor implements MethodInterceptor  {

	public Object invoke(MethodInvocation invocation) throws Throwable { // ¿ÉÄÃµ½methodName methodArgu result
		System.out.println("before");
		System.out.println(invocation.getMethod().getName());
		System.out.println(invocation.getArguments());
		System.out.println(invocation.getThis());
		System.out.println(((Service)invocation.getThis()).getErrorcode());
		Object result = invocation.proceed(); 
		System.out.println("after");
	    return result;
    }
	
}
