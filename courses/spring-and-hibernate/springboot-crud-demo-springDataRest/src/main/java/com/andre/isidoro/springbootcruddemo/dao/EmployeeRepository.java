package com.andre.isidoro.springbootcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.isidoro.springbootcruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//no need to write code
}
