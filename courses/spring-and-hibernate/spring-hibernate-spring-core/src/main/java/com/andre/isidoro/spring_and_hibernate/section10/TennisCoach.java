package com.andre.isidoro.spring_and_hibernate.section10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach{

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@PostConstruct
	public void init() {
		System.out.println("Tennis Coach: In init method");
	}
	
	
	//Remember that with the prototype scope spring does not call the @PreDestroy method
	@PreDestroy
	public void destroy() {
		System.out.println("Tennis Coach: In destroy method");
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
