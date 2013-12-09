package com.tiemei.demo.spring.aop.base;


public class CustomerBoImpl extends BaseClass implements CustomerBo{

	public void addCustomer() {
		System.out.println("run addCustomer()");
		methodInBaseClass();
		abstractMethodInBaseClass();
    }

	@Override
    public void abstractMethodInBaseClass() {
		System.out.println("run abstractMethodInBaseClass()");
    }

}
