/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    /*Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Question q=(Question)factory.getBean("q");  
    q.displayInfo();  
    */
    
    
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");   
     
    /* //simple string collection 
     Question que1 = (Question)context.getBean("q");
     que1.displayInfo();
     */
    
    //object collection
    Question que = (Question)context.getBean("q");
    que.displayInfo();
}  
}  