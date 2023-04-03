package com.teluguskillhub.taskproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teluguskillhub.taskproject.entity.Employee;
import com.teluguskillhub.taskproject.repository.EmployeeRepo;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	// Annotation
	@Autowired
	private EmployeeRepo employeeRepo;

	// Save operation
	@GetMapping("/employee")
	public Employee saveEmployee() {
		Employee employee=new Employee();
	 	employee.setEmployeeName("vineesha");
		return employeeRepo.save(employee);
	}

	// Read operation
	@GetMapping("/departments")
	public List<Employee> fetchDepartmentList() {
		return employeeRepo.findAll();
	}

}
