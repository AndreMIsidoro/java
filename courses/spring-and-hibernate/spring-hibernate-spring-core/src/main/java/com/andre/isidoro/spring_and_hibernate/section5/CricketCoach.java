package com.andre.isidoro.spring_and_hibernate.section5;

import com.andre.isidoro.spring_and_hibernate.section5.FortuneService;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String team;
	private String email;

	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}
}
