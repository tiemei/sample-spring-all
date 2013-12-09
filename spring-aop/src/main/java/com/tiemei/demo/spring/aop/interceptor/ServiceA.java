package com.tiemei.demo.spring.aop.interceptor;


public class ServiceA extends Service{
	@Override
	public String methodInService(){
		System.out.println("run methodInService() in ServiceA");
		return super.methodInService();
	}
	
	
}
