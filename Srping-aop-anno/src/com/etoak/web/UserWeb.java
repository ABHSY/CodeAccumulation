package com.etoak.web;

import org.springframework.stereotype.Controller;

@Controller
public class UserWeb {
	public String add(String username,String password){
		System.out.println("add������������");
		int i = 1/0;
		return "�û�����" + username + ",���룺" + password;
	}
}
