package com.andre.isidoro.spring_and_hibernate.section10;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Value("${foo.team}")
	private String team;
	@Value("${foo.email}")
	private String email;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

	
	
}
