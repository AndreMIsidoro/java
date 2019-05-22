package com.andre.isidoro.spring_and_hibernate.section8;

import org.springframework.stereotype.Component;

@Component
public class RamdomFortuneService implements FortuneService{

	public String getFortune() {
		return "Random fortune";
	}

}
