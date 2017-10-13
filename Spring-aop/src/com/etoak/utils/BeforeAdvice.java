package com.etoak.utils;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//BeforeAdvice ������ʾ ���棨�����ࣩ
public class BeforeAdvice implements MethodBeforeAdvice{
	
	//���before������ʾ֪ͨ
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before:" + arg0.getName());
		if(arg1.length > 0){
			for(Object obj : arg1){
				System.out.println("before:" + obj);
			}
		}
		System.out.println("before:" + arg2.getClass().getName());
		System.out.println("ִ��֮ǰ����O(��_��)O~��������");
	}

}
