package com.nativeSQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.java.hibernate.Student;

public class nativedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println( "Project started" );
	        
	        Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        org.hibernate.Session s=factory.openSession();
	        
	        String q="select * from student";
	        NativeQuery nq= s.createSQLQuery(q);
	        List<Object[]> list =nq.list();
	        
	        
	        for(Object[] stu:list) {
	        	System.out.println(Arrays.deepToString(stu));
	        }
	        
	        s.close();
	        factory.close();
	}

}
