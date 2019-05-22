package com.andre.isidoro.spring_and_hibernate.section9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section9/applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyWorkout());
		
		System.out.println("Are coaches the same = " + (theCoach == alphaCoach));
		
		context.close();
	}
}
 