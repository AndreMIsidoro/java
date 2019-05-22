package com.andre.isidoro.spring_and_hibernate.section8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachField implements Coach{
	
	@Autowired
	@Qualifier("ramdomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoachField() {}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}	
}
