package com.andre.isidoro.spring_and_hibernate.section8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoachSetterInjection")
public class TennisCoachSetter implements Coach{
	
	private FortuneService fortuneService;
	
	public TennisCoachSetter() {}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("ramdomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
}
