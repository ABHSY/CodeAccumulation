package com.etoak.service;

import javax.jws.WebService;

@WebService(
			endpointInterface="com.etoak.service.UserService",
			serviceName="UserServiceImpl",
			portName="UserServiceImplPort"
		)
public class UserServiceImpl implements UserService {

	@Override
	public String login(String username, String password) {
		System.out.println("�û�����" + username);
		System.out.println("���룺" + password);
		return "�û�����" + username + ",���룺" + password;
	}

	//@WebMethod(exclude=true) //ʹ��jdk����������Ч�����ظ÷���
	@Override
	public void del() {
		
	}

}
