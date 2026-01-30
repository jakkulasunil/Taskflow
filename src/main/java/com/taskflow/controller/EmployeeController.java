package com.taskflow.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.model.Employee;
import com.taskflow.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Employee API's", description = "Operations related to Employees")
@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/emp")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Operation(summary = "Create a Employee", description = "Create a new Employee")
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		logger.info("Request received to create employee: name={}, email={}", employee.getEmployeeName(),
				employee.getEmail());
		Employee savedEmp = employeeService.saveEmployee(employee);
		logger.info("Employee created successfully with id={}", savedEmp.getEmployeeId());
		return savedEmp;
	}

	@Operation(summary = "Get All employees", description = "Get All Employees")
	@GetMapping("/allEmp")
	public List<Employee> getAllEmployees() {

		logger.info("Request received to fetch all employees");

		List<Employee> employees = employeeService.getEmployees();
		logger.info("Total employees fetched: {}", employees.size());
		return employees;

	}

}
