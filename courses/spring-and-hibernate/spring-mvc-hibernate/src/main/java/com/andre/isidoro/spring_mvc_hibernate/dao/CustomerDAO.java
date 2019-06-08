package com.andre.isidoro.spring_mvc_hibernate.dao;

import java.util.List;

import com.andre.isidoro.spring_mvc_hibernate.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}
