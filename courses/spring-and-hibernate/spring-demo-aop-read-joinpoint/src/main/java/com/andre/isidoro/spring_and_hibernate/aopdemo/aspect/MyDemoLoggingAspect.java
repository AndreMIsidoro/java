package com.andre.isidoro.spring_and_hibernate.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.andre.isidoro.spring_and_hibernate.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	

	
	
	//Run this code Before - target object method: "public void addAccount()"
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO.addAccount())")
	@Before("com.andre.isidoro.spring_and_hibernate.aopdemo.aspect.PoincutAopExpressions.forDaoPackageNotGetterNotSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("###### Execting @Before advice on method addAcount()#######");
		
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: " + methodSignature) ;
		
		Object [] args = joinPoint.getArgs();
		
		for(Object tempArg: args) {
			System.out.println(tempArg);
			if(tempArg instanceof Account) {
				Account account = (Account) tempArg;
				System.out.println("account name: " + account.getName());
				System.out.println("account level: " + account.getLevel());
			}
		}
	}
	
	

	

}
