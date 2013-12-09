package com.tiemei.demo.spring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiemei.demo.spring.aop.base.CustomerBo;
import com.tiemei.demo.spring.aop.base.CustomerBoImpl;


public class Run {
	public static void main(String args[]) {
		ApplicationContext contx = new ClassPathXmlApplicationContext("application.xml");
		CustomerBo bean = (CustomerBo) contx.getBean("customerBo");
		bean.addCustomer();
//		new CustomerBoImpl().addCustomer();
	}
}
