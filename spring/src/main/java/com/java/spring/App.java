package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	
    ApplicationContext con= new ClassPathXmlApplicationContext("spring.xml");
    		Student o= (Student)con.getBean("idname");
    		o.show();
    }
}
