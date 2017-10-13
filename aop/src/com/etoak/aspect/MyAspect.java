package com.etoak.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//�Ǻ���ҵ��
public class MyAspect {

	//����֪ͨ
	
	public void before(JoinPoint jp) {
		System.out.println("before-�����������֣�"+jp.getSignature().getName());
		System.out.println("before-��������������"+jp.getArgs());
		System.out.println("before-���������"+jp.getTarget());
		System.out.println("before-���ڵ��õ���Ȩ����֤");
	}
	
	public void afterreturning(JoinPoint jp,Object rvt){
		System.out.println("afterreturning-�����������֣�"+jp.getSignature().getName());
		System.out.println("afterreturning-��������������"+jp.getArgs());
		System.out.println("afterreturning-���������"+jp.getTarget());
		System.out.println("afterreturning-���������ķ���ֵ"+rvt);
		System.out.println("afterreturning-���ڵ��õ�����־����");
	}
	

	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("���ڵ��õ���������");		
		//�õ�ҵ�񷽷��Ĳ���
		Object[] args=pjp.getArgs();
		System.out.println("ҵ�񷽷��Ĳ�����"+args);
		//����������ҵ�񷽷�
		Object result=pjp.proceed(args);
		System.out.println("���ڵ��õ��������ύ��ع�");
	    return result;
	}
	
	
	public void after(){
		System.out.println("��Դ�Ѿ����ͷţ�");		
	}
	
	public void throwEx(Exception ex){
		System.out.println("�쳣��Ϣ��" + ex.getMessage());
	}
	
}
