package com.tiemei.demo.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {

	public static void main(String[] args) {
		ApplicationContext contx = new ClassPathXmlApplicationContext("annotation.xml");
		Person bean = (Person) contx.getBean("person");
		bean.say();
	}

}
