package com.etoak.utils;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//������
public class AroundAdvice implements MethodInterceptor{

	//֪ͨ
	@Override
	public Object invoke(
			MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		if(args.length > 0){
			for(Object obj : args){
				System.out.println("around:" + 
						obj.getClass().getName() + "| " + obj);
			}
		}
		Method method = invocation.getMethod();
		System.out.println("around:" + method.getName());
		
		System.out.println("��������");
		Object result = invocation.proceed();//���ӵ�
		System.out.println("�ύ����");
		return result;
	}

}
