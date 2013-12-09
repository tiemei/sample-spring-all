package com.tiemei.demo.spring.aop.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {
	public static void main(String args[]) {
		ApplicationContext contx = new ClassPathXmlApplicationContext("application.xml");
		Service service = (Service) contx.getBean("serviceA");
		System.out.println(service.methodInService());
	}
}	
