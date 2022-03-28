package com.Secondcache;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.Student;

public class cacheSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			org.hibernate.Session s1= f.openSession();
			
			//first
			
			Student student1=s1.get(Student.class,104);
			System.out.println(student1);
			s1.close();
			
			org.hibernate.Session s2=f.openSession();

			Student student2=s1.get(Student.class,104);
			System.out.println(student2);
			s1.close();
			
	}

}
