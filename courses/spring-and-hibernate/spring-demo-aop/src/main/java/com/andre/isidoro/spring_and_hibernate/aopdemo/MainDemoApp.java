package com.andre.isidoro.spring_and_hibernate.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO;
import com.andre.isidoro.spring_and_hibernate.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO" , AccountDAO.class);
		accountDAO.addAccount(new Account(), true);
		MembershipDAO membershipDAO = context.getBean("membershipDAO" , MembershipDAO.class);
		membershipDAO.addAccount();
		context.close();

	}

}
