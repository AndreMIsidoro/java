package com.andre.isidoro.spring_and_hibernate.section6;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: In the constructor method");
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Just do it: " + fortuneService.getFortune();
	}

	
	public void doMyStarupStuff() {
		System.out.println("TrackCoach: Inside startup method");	
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: Inside cleanup method");	
	}
}
