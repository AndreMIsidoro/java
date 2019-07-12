package com.andre.isidoro.springbootcruddemo.service;

import java.util.List;

import com.andre.isidoro.springbootcruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
