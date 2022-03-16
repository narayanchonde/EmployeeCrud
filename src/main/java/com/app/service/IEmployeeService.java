package com.app.service;

import java.util.List;

import com.app.entity.Employee;

public interface IEmployeeService {
	
	Long saveOneEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
 
}
