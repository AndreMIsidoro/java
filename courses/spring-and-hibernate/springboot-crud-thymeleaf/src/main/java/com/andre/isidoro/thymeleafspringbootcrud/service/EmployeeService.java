package com.andre.isidoro.thymeleafspringbootcrud.service;

import java.util.List;

import com.andre.isidoro.thymeleafspringbootcrud.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
