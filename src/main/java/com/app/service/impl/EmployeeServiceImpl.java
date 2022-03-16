package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repo.EmployeeRepository;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Long saveOneEmployee(Employee employee) {
		
		return repo.save(employee).getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee>  list=repo.findAll();
		return list;
	}
	

}
