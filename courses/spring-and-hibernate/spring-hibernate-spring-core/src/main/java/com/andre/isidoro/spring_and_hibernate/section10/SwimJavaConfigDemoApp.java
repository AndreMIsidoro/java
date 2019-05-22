package com.andre.isidoro.spring_and_hibernate.section10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigNoComponentScan.class);
		
		SwimCoach theCoach = context.getBean("swimCoach" , SwimCoach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		context.close();
	}
}
 