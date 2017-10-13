package com.etoak.test;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.etoak.service.UserService;
import com.etoak.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		String url = "http://localhost:8088/ws/user";
		cxfws(url);
		//jdkws(url);
		
	}
	
	public static void cxfws(String url){
		//1.����һ������ˣ�������������
		JaxWsServerFactoryBean service = 
				new JaxWsServerFactoryBean();
		//2.����һ��url��ַ�������ͻ��˽��з���
		service.setAddress(url);
		//3.���ͻ��˱�¶Զ�̽ӿ�
		service.setServiceClass(UserService.class);
		//4.���ͻ��˱�¶Զ��ʵ����
		service.setServiceBean(new UserServiceImpl());
		//5.��������
		service.create();
	}
	
	public static void jdkws(String url){
		Endpoint.publish(url, new UserServiceImpl());
	}

}
