package com.andre.isidoro.spring_and_hibernate.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.andre.isidoro.spring_and_hibernate.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String servicecode;
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": Doing My DB work: adding an account");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + ": getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": setName()");
		this.name = name;
	}

	public String getServicecode() {
		System.out.println(getClass() + ": getServicecode()");
		return servicecode;
	}

	public void setServiceCode(String servicecode) {
		System.out.println(getClass() + ": setServiceCode()");
		this.servicecode = servicecode;
	}
	
	
}
