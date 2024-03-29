package com.java.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String args[]) {
		
		Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
       Student studen1= new Student();
       studen1.setId(1);
       studen1.setName("SUMANA");
       studen1.setCity("pokhara");
       
       Certificate certificate=new Certificate();
       certificate.setCourse("ANDROID");
       certificate.setDuration("2 months");
       
            studen1.setCerti(certificate);
        
            
            //////student 2 
            
            
            Student studen2= new Student();
            studen2.setId(2);
            studen2.setName("MANITA");
            studen2.setCity("ILAM");
            
            Certificate certificate2=new Certificate();
            certificate2.setCourse("HIBERNATE");
            certificate2.setDuration("4 months");
            
            
            studen2.setCerti(certificate2);
            
            

            org.hibernate.Session session=factory.openSession();
                      
            Transaction tx=session.beginTransaction();
            
            session.save(studen1);
            session.save(studen2);
            
            
            tx.commit();
            session.close();
        factory.close();
	}

}
