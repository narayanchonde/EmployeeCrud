package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.rest.exception.EmployeeNotFoundException;
import com.app.service.IEmployeeService;

@RestController
@RequestMapping("api/emp")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;
	
	
	//1 Fetch Employee All data
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>  getAllEmployee(){
		ResponseEntity<List<Employee>> response=null;
		
		try {
			List<Employee> list=service.getAllEmployees();
			response=ResponseEntity.ok(list);
			
		} catch (EmployeeNotFoundException enfe) {
			enfe.printStackTrace();
			throw enfe;
		}

		return response;
		
	}
	
	//2 save Details of employee One 
	
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
		ResponseEntity<String>  response=null;
		try {
			Long id=service.saveOneEmployee(employee);
			response=ResponseEntity.ok("Employee '"+id+"'Created");
		} catch (EmployeeNotFoundException enfe) {
			enfe.printStackTrace();
			throw enfe;
		}
		
		return response;
	}
	
	//2 Delete employee by id
		public ResponseEntity<String>  employeeDelete(@PathVariable Long id){
			
			
			return null;
		}
	
	//3 get one  employee by id for edit operation
	
	//4 update Employee 
	
	//5 
}
