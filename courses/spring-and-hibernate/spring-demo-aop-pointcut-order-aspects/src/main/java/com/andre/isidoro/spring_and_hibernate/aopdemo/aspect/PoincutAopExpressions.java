package com.andre.isidoro.spring_and_hibernate.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PoincutAopExpressions {
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.andre.isidoro.spring_and_hibernate.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNotGetterNotSetter() {}

}
