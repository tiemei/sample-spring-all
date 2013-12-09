package com.tiemei.demo.spring.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Target(ElementType.TYPE)//注解的作用域
@Retention(RetentionPolicy.RUNTIME)//注解的生命周期
@Component//spring自身的注释
public @interface YLKAnnotation {
	
}
