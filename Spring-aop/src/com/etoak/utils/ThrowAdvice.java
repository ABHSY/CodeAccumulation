package com.etoak.utils;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//������
public class ThrowAdvice implements ThrowsAdvice{
	
	//֪ͨ
	public void afterThrowing(
			Method method, Object[] args, Object target, Exception e){
		System.out.println("throw:" + method.getName());
		System.out.println("throw:" + e.getMessage());
	}
	
}
