package com.etoak.web;

//UserWeb���ͱ�ʾĿ�����
public class UserWeb {
	
	//�����
	public String add(String username,String password){
		System.out.println("add����������");
		return "�û�����" + username + "|���룺" + password;
	}
	
	//�����
	public String del(String id){
		System.out.println("ɾ������ID��" + id);
		//int i = 1/0; ���쳣 �����쳣֪ͨ
		return id;
	}

}
