package com.andre.isidoro.spring_and_hibernate.section7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section7/applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}
}
