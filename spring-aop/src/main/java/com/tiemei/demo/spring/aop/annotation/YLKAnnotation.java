package com.tiemei.demo.spring.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Target(ElementType.TYPE)//ע���������
@Retention(RetentionPolicy.RUNTIME)//ע�����������
@Component//spring�����ע��
public @interface YLKAnnotation {
	
}
