package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.web.UserWeb;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		UserWeb uw = (UserWeb)ac.getBean("userWeb");
		/*String str = uw.add("etoak", "etaoker");
		System.out.println(str);*/
		String str = uw.del("2853");
		System.out.println(str);
	}

}
