package com.andre.isidoro.spring_and_hibernate.section6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section6/beanScope_applicationContext.xml");
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		Coach otherCoach = context.getBean("myCoach" , Coach.class);
		
		System.out.println("Are coaches the same ? " + (theCoach == otherCoach));
		
		theCoach = context.getBean("myCoachDiff" , Coach.class);
		
		otherCoach = context.getBean("myCoachDiff" , Coach.class);
		
		System.out.println("Are coaches the same ? " + (theCoach == otherCoach));
		
		context.close();
	}
}
