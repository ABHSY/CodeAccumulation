package com.etoak.util;

public class Globals {

	//ְ��
	public static Integer ZHIWU_JINGLI = 40;
	public static Integer ZHIWU_FENGUANJINGLI = 30;
	public static Integer ZHIWU_ZHONGCENGZHENGZHI = 10;
	public static Integer ZHIWU_ZHONGCENGFUZHI = 5;
	public static Integer ZHIWU_NONE = 0;
	
	//ְ��
	public static Integer ZHICHENG_GAOJI = 100;
	public static Integer ZHICHENG_ZHONGJI = 60;
	public static Integer ZHICHENG_CHUJI = 30;
	public static Integer ZHICHENG_NONE = 0;
	
	public static Integer selectScoreByKey(String key){
		
		if("����".equals(key)) return Globals.ZHIWU_JINGLI;
		else if("�ֹܾ���".equals(key)) return Globals.ZHIWU_FENGUANJINGLI;
		else if("�в���ְ".equals(key)) return Globals.ZHIWU_ZHONGCENGZHENGZHI;
		else if("�в㸱ְ".equals(key)) return Globals.ZHIWU_ZHONGCENGFUZHI;
		else if("����".equals(key)) return Globals.ZHIWU_NONE;
		
		else if("�߼�".equals(key)) return Globals.ZHICHENG_GAOJI;
		else if("�м�".equals(key)) return Globals.ZHICHENG_ZHONGJI;
		else if("����".equals(key)) return Globals.ZHICHENG_CHUJI;
		else if("��ְ��".equals(key)) return Globals.ZHICHENG_NONE;
		
		else if("һ��".equals(key)) return 2;
		else if("����".equals(key)) return 4;
		else if("����".equals(key)) return 6;
		else if("����".equals(key)) return 8;
		else if("����".equals(key)) return 10;
		else if("����".equals(key)) return 12;
		else if("����".equals(key)) return 14;
		else if("����".equals(key)) return 16;
		else if("����".equals(key)) return 18;
		else if("ʮ��".equals(key)) return 20;
		else if("ʮһ��".equals(key)) return 22;
		else if("ʮ����".equals(key)) return 24;
		else if("ʮ����".equals(key)) return 26;
		else if("ʮ����".equals(key)) return 28;
		else if("ʮ����".equals(key)) return 30;
		else if("ʮ����".equals(key)) return 32;
		else if("ʮ����".equals(key)) return 34;
		else if("ʮ����".equals(key)) return 36;
		else if("ʮ����".equals(key)) return 38;
		else if("��ʮ��".equals(key)) return 40;	
		
		return 0;
	}
	
	
	
	
}
