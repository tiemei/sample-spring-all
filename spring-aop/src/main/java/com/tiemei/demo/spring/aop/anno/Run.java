package com.tiemei.demo.spring.aop.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext contx = new ClassPathXmlApplicationContext("anno.xml");
		Service service = (Service) contx.getBean("service");
		service.method();
	}
}
