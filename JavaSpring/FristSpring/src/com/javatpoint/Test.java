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
    
    //BeanFactory is not recommanded to use Insted of that us Application Context
   /*Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      */
   
      
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Student student=(Student)context.getBean("studentbean");  
    student.displayInfo();  
    
     Student student1=(Student)context.getBean("studentbean1");  
     student1.displayInfo();  
     
     System.out.println("******************************************DI");
     
    /* Employee e1 = (Employee)context.getBean("e");
     e1.show();
     */
    
     System.out.println("*****************************DI by constucor");

     Employee e2 = (Employee)context.getBean("employee");
     e2.show();
}  
}  