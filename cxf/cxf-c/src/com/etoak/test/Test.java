package com.etoak.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.etoak.client.UserService;
import com.etoak.client.UserServiceService;

public class Test {

	public static void main(String[] args) {
		//jdkws();
		cxfws();
	}
	
	public static void jdkws(){
		UserServiceService uss = new UserServiceService();
		UserService us = uss.getUserServicePort();
		String result = us.login("����", "123456");
		System.out.println("�ͻ��ˣ�" + result);
	}
	
	public static void cxfws(){
		
		String url = "http://localhost:8088/ws/user";
		
		//1.���ɿͻ���
		JaxWsProxyFactoryBean client = 
				new JaxWsProxyFactoryBean();
		//2.���÷����url��ַ
		client.setAddress(url);
		//3.���÷���˱�¶�Ľӿ�
		client.setServiceClass(UserService.class);
		//4.���÷���˽ӿ�ҵ���߼�
		UserService us = (UserService)client.create();
		
		String result = us.login("����", "123456");
		
		System.out.println("�ͻ��ˣ�" + result);
	}

}
