package com.etoak.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

@Service
@WebService
public class UserServiceImpl implements UserService {

	@Override
	public String login(String username, String password) {
		System.out.println("�û�����" + username);
		System.out.println("���룺" + password);
		return "�û�����" + username + ",���룺" + password;
	}
	
}
