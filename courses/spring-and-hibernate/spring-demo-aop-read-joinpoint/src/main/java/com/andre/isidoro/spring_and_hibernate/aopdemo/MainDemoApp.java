package com.andre.isidoro.spring_and_hibernate.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.andre.isidoro.spring_and_hibernate.aopdemo.dao.AccountDAO;
import com.andre.isidoro.spring_and_hibernate.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO" , AccountDAO.class);
		Account myAccount = new Account();
		myAccount.setLevel("Diamond");
		myAccount.setName("Andre");
		accountDAO.addAccount(myAccount, true);
		accountDAO.doWork();
		
		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");
		
		accountDAO.getName();
		accountDAO.getServicecode();
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO" , MembershipDAO.class);
		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();
		context.close();

	}

}
