package com.etoak.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class UrlParse {
	
	public static void main(String[] args)throws Exception{
		System.out.println(radioUrl("http://v.youku.com/v_show/id_XNTU5NTQ2Nzc2.html"));
	}

	public static String radioUrl(String url){
		try{
			Document doc = getURLContent(url);
			return getElementAttrById(doc, "link2", "value");
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}    
	
	/**  
     * ��ȡ��ҳ������  
     */  
    private static Document getURLContent(String url) throws Exception{   
        Document doc = Jsoup.connect(url)   
          .data("query", "Java")   
          .userAgent("Mozilla")   
          .cookie("auth", "token")   
          .timeout(6000)   
          .post();   
        return doc;   
    }  
    
    /**  
     * ����HTML��ID��������������ȡ����ֵ  
     * @param id  HTML��ID��  
     * @param attrName  ������  
     * @return  ��������ֵ  
     */  
    private static String getElementAttrById(Document doc, String id, String attrName)throws Exception{   
        Element et = doc.getElementById(id);   
        String attrValue = et.attr(attrName);   
           
        return attrValue;   
    } 
}
