package com.HQL;

import   com.java.hibernate.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      System.out.println( "Project started" );
	        
	        Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        org.hibernate.Session s=factory.openSession();
	        
	        ////HQL
	        ///syntax
	        
//	        String query="from Student where city=ktm";
//	         
//	        Query q=s.createQuery(query);
	        
	        
	        ///OROROROR
	        
	        String query="from Student where city=:x";
	         
	        Query q=s.createQuery(query);
	        q.setParameter("x", "KTM");
	        //single -unique
	        //multipl -list of student
	        
	        List <Student> list=q.list();
	        
	        
	        for(Student student:list) {
	        	System.out.println(student.getName());
	        	
	        }
	        
//	        Transactional tx=
	        
	        s.close();
	        factory.close();
	}

}
