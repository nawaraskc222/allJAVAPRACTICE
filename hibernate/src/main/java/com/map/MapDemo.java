package com.map;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.out.println( "Project started" );
	        
	        Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        
	        ///creating question
	        
	        Question q1= new Question();
	        
	        q1.setQuestionId(1212);
	        q1.setQuestion("what is java?");
	        
	        Answer a1= new Answer();
	        a1.setAnswer_Id(343);
	        a1.setAnswer("java is programming langauage");
	        
	        q1.setAnswer(a1);
	        
	        
	        
	        	Question q2= new Question();
	        
	        q2.setQuestionId(242);
	        q2.setQuestion("what is collection Framwwork?");
	        
	        Answer a2= new Answer();
	        a2.setAnswer_Id(344);
	        a2.setAnswer("API to woek with object");
	        
	        q2.setAnswer(a2);
	        
	        org.hibernate.Session session=factory.openSession();
	        
	        Transaction tx=session.beginTransaction();
	        
	        session.save(q1);
	        session.save(q2);
	        session.save(a1);
	        session.save(a2);
	        tx.commit();
	        session.close();
	        factory.close();

	}

}
