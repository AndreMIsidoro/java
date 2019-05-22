package com.andre.isidoro.spring_and_hibernate.section8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoachConstructorInjection")
public class TennisCoachConstructor implements Coach{
	
	private FortuneService fortuneService;
//	
//	@Autowired
//	@Qualifier("happyFortuneService")
//	public TennisCoachConstructor(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
