package com.andre.isidoro.spring_and_hibernate.section6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section6/beanLifeCycle_applicationContext.xml");
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
			
		context.close();
	}
}
