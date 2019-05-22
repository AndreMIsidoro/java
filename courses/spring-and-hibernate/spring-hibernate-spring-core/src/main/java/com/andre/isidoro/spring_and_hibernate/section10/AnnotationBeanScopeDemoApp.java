package com.andre.isidoro.spring_and_hibernate.section10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBeanScopeDemoApp {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyWorkout());
		
		System.out.println("Are coaches the same = " + (theCoach == alphaCoach));
		
		context.close();
	}
}
 