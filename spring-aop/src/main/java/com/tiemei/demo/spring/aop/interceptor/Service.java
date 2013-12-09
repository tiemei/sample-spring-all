package com.tiemei.demo.spring.aop.interceptor;


public class Service {
	public String methodInService(){
		System.out.println("run methodInService()");
		return "result";
	}
	
	public int getErrorcode() {
		return 1;
	}
	
}
