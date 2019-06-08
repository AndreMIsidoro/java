package com.andre.isidoro.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating 3 students ...");
			Student tempStudent1 = new Student("Paul1", "Wall" , "paul@luv2code.com");
			Student tempStudent2 = new Student("Paul2", "Wall" , "paul@luv2code.com");
			Student tempStudent3 = new Student("Paul3", "Wall" , "paul@luv2code.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student ...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	
	}
}
