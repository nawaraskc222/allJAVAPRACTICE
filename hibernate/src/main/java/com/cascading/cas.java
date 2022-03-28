package com.cascading;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class cas {

	public static void main(String[] args) {
		
		
//		System.out.println("asdsa");
		
		
		 Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory f=cfg.buildSessionFactory();
	        
	        
	        Question q1= new Question();
	        q1.setQuestionId(567);
	        q1.setQuestion("what is cascading?");
	        
	        org.hibernate.Session s=f.openSession();
	        
	        
	        Transaction tx=s.beginTransaction();
	        
	        tx.commit();
	        s.close();
	        f.close();
	        
	        
	}
}
