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
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNotGetterNotSetter() {}
	
	
	//Run this code Before - target object method: "public void addAccount()"
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO.addAccount())")
	@Before("forDaoPackageNotGetterNotSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("###### Execting @Before advice on method addAcount()#######");
		
	}
	
	
	@Before("forDaoPackageNotGetterNotSetter()")
	public void performApiAnalytics() {
		System.out.println("####### Performing Api Analytics ######");
		
	}
}
