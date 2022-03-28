package com.State;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.*;

public class stateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object in States
		//transisent, persistance,detached, removal states
		
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		
		//creating student obj
		
		Student student = new Student();
		student.setId(1012);
		student.setName("NAWARAS");
		student.setCity("BKT");
		student.setCerti(new Certificate("JAVA COURSE","2 months"));
		///student : Transient
		
				org.hibernate.Session s=f.openSession();
        
        Transaction tx=s.beginTransaction();
			s.save(student);
			//studetn : persistet- session,database associate
			student.setName("JOHN");
			tx.commit();
			s.close();
			//detached stte
			student.setName("RAMM");
			System.out.println(student);
		f.close();
	}

}
