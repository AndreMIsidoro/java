package com.andre.isidoro.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, 1);

			myStudent.setFirstName("Scooby");

			session.getTransaction().commit();


			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student student : theStudents) {
			System.out.println(student);
		}
	}
}
