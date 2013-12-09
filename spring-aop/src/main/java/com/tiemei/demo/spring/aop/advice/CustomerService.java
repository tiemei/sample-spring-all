package com.tiemei.demo.spring.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerService {
	public void targetMethod() {
		System.out.println("inner targetMethod");
	}
	
	public static void main(String[] args) {
		ApplicationContext contx = new ClassPathXmlApplicationContext("advice.xml");
		CustomerService bean = (CustomerService) contx.getBean("targetClassProxy");
		bean.targetMethod();
	}
}
