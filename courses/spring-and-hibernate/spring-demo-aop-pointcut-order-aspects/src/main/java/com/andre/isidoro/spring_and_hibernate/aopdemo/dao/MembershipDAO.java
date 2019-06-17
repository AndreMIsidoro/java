package com.andre.isidoro.spring_and_hibernate.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyMember() {
		System.out.println(getClass() + ": Doing My DB work: adding a membership account");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep now ...");
	}
}
