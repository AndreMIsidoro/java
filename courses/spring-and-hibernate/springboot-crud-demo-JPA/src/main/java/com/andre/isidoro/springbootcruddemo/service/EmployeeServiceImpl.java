package com.andre.isidoro.springbootcruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.isidoro.springbootcruddemo.dao.EmployeeDAO;
import com.andre.isidoro.springbootcruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	public void deleteById(int id) {
		employeeDAO.deleteById(id);
	}

}
