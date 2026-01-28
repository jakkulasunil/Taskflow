package com.taskflow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taskflow.dao.DepartmentRepository;
import com.taskflow.dao.EmployeeDao;
import com.taskflow.model.Department;
import com.taskflow.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeDao employeeDao;
	private final DepartmentRepository departmentDao;

	public EmployeeServiceImpl(EmployeeDao employeeDao, DepartmentRepository departmentDao) {
		super();
		this.employeeDao = employeeDao;
		this.departmentDao = departmentDao;
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

}
