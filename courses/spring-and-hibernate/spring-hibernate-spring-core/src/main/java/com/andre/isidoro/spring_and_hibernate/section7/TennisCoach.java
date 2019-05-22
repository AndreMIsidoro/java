package com.andre.isidoro.spring_and_hibernate.section7;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
