package com.tiemei.demo.spring.aop.pointcutAdvisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiemei.demo.spring.aop.advice.CustomerService;
import com.tiemei.demo.spring.aop.advice.ErrorService;
import com.tiemei.demo.spring.aop.advice.SonService;

/**
 * http://www.mkyong.com/spring/spring-aop-example-pointcut-advisor/
 *
 * @author tiemei.jdk
 * @date   2012-11-28
 */
public class MyInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("around before");
		invocation.proceed();
		System.out.println("around after");
	    return null;
    }
	
	public static void main(String args[]){
//		ApplicationContext contx = new ClassPathXmlApplicationContext("pointcutAdvisor.xml");
//		ApplicationContext contx = new ClassPathXmlApplicationContext("pointcutAdvisor2.xml");
		ApplicationContext contx = new ClassPathXmlApplicationContext("pointcutAdvisorAutoProxy.xml");
		CustomerService bean = (CustomerService) contx.getBean("targetClass");
		ErrorService errorService = (ErrorService) contx.getBean("errorService");
		SonService sonService = (SonService) contx.getBean("sonService");
		DiffPackageService dService = (DiffPackageService) contx.getBean("diffPackageService");
		dService.targetMethod();
		bean.targetMethod();
//		errorService.targetMethod1();
//		sonService.targetMethod();
	}
	
}
