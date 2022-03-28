package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//get ,load the data
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
       
        
        //get-student:103
//        
//        Student student= (Student)session.get(Student.class, 103);
//        System.out.println(student);
        
        //load-student:103
        Student student= (Student)session.load(Student.class, 103);
//        System.out.println(student);
        
        							//(id , primary key)=(Address.class,1)
        Address ad=(Address)session.get(Address.class, 1);
      
        System.out.println(ad.getCity()+" : "+ ad.getAddressId());
        
        session.close();
        factory.close();
        

	}

}
