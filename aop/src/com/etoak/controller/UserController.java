package com.etoak.controller;

//����ҵ��
public class UserController {
	
	//�����
	public String login(String username,String password){
		System.out.println("����ҵ���߼���" + username + "|" + password);
		//ע�ʹ�int i = 1/0;�����쳣֪ͨ
		//int i = 1/0;
		return username + "|" + password;
	}

}
