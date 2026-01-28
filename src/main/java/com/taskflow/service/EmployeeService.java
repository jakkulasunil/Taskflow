package com.taskflow.service;

import java.util.List;

import com.taskflow.model.Employee;


public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getEmployeeByNames(String departmentName);
	
	public List<Employee> getEmployees();
}
