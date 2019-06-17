package com.andre.isidoro.spring_and_hibernate.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	@Before("com.andre.isidoro.spring_and_hibernate.aopdemo.aspect.PoincutAopExpressions.forDaoPackageNotGetterNotSetter()")
	public void performApiAnalytics() {
		System.out.println("####### Performing Api Analytics ######");
		
	}

}
