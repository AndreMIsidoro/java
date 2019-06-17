package com.andre.isidoro.spring_and_hibernate.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.andre.isidoro.spring_and_hibernate.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": Doing My DB work: adding an account");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}
}
