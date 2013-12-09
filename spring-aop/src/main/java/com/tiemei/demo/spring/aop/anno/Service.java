package com.tiemei.demo.spring.aop.anno;


public class Service {
	@TopBefore
	public void method () {
		System.out.println("method");
	}
	

}
