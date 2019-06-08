package com.andre.isidoro.spring_mvc_hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andre.isidoro.spring_mvc_hibernate.dao.CustomerDAO;
import com.andre.isidoro.spring_mvc_hibernate.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO customerDao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

}
