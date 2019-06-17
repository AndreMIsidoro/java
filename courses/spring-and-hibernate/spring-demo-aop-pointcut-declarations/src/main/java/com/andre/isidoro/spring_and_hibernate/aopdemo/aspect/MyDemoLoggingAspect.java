package com.andre.isidoro.spring_and_hibernate.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//Run this code Before - target object method: "public void addAccount()"
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO.addAccount())")
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("###### Execting @Before advice on method addAcount()#######");
		
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("####### Performing Api Analytics ######");
		
	}
}
