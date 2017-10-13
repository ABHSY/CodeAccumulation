package com.etoak.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.etoak.bean.Employee;
import com.etoak.bean.Premission;
import com.etoak.bean.Role;

public class RoleInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Employee emp = (Employee)request.getSession().getAttribute("emp");
		if(emp!=null){ //�ѵ�½
			//��ǰִ�е������� addBook.do 
			StringBuffer sb = request.getRequestURL();
			String path = sb.toString().substring(sb.toString().lastIndexOf("/")+1);
			//System.out.println("��ǰ�ύ������---"+path);
		
			//����Ȩ�ޱ������е�Ȩ��
			List<String> allPres = (List<String>)request.getSession().getAttribute("allPres");
			//System.out.println(allPres+"============");
			boolean flat = false;
			for(String pre:allPres){
				//System.out.println(pre+"--ALL--PATH--"+path);
				if(pre.equals(path)){
					System.out.println("�ɲ���Ȩ��...");
					flat = true;
					//start - ��ǰ�û��߱�Ȩ��
					List<String> thisPers = (List<String>)request.getSession().getAttribute("thisPres");
					//System.out.println(thisPers+"---------");
					for(String thisPre:thisPers){
						System.out.println(thisPre+"--ALL--PATH--"+path);
						if(thisPre.equals(path)) {
							//System.out.println("�߱���Ȩ��...");
							return true;
						}
					}
					//end - ��ǰ�û��߱�Ȩ��
				}
			}
			//flat  false ����Ȩ���б��� |  true  �ɲ���Ȩ��
			if(!flat){
				System.out.println("���ɲ���Ȩ��...");
				return true;
			}
			else {
				//System.out.println("�ɲ���Ȩ��...");
				System.out.println("���߱�Ȩ��...");
				response.sendRedirect("/index.jsp?manage=norole");
				return false;
			}
		}else{
			response.sendRedirect("/login.jsp");
			return false;
		}
	}

}








