package com.andre.isidoro.spring_and_hibernate.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//Run this code Before - target object method: "public void addAccount()"
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO.addAccount())")
	@Before("execution(* add*(com.andre.isidoro.spring_and_hibernate.aopdemo.Account, ..))")
	public void beforeAddAccountAdvice() {
		System.out.println("###### Execting @Before advice on method addAcount()#######");
		
	}
}
