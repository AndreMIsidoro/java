package com.andre.isidoro.spring_and_hibernate.section8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemoApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section8/applicationContext.xml");
//		
//		Coach theCoachConstructor = context.getBean("tennisCoachConstructorInjection" , Coach.class);
//		
//		System.out.println(theCoachConstructor.getDailyWorkout());
//		
//		System.out.println(theCoachConstructor.getDailyFortune());
		
		Coach theCoachSetter = context.getBean("tennisCoachSetterInjection" , Coach.class);
		
		System.out.println(theCoachSetter.getDailyWorkout());
		
		System.out.println(theCoachSetter.getDailyFortune());
		
		Coach theCoachField = context.getBean("tennisCoachField" , Coach.class);
		
		System.out.println(theCoachField.getDailyWorkout());
		
		System.out.println(theCoachField.getDailyFortune());
		context.close();
	}
}
