package com.taskflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskflow.dao.DepartmentRepository;
import com.taskflow.dao.EmployeeDao;
import com.taskflow.model.Department;
import com.taskflow.model.Employee;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private  EmployeeDao employeeDao;
	@Autowired
	private  DepartmentRepository departmentDao;
	
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		long deptId = employee.getDepartment().getDepartmentId();
		Department dept = departmentDao.findById(deptId)
				.orElseThrow(() -> new RuntimeException("Department Not Found"));
		employee.setDepartment(dept);
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getEmployeeByNames(String departmentName) {
		// TODO Auto-generated method stub
		return employeeDao.findByDepartment_DepartmentName(departmentName);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	
	@PostConstruct
	public void test() {
	    System.out.println("EmployeeDao = " + employeeDao);
	}

}
