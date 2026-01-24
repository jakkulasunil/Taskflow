package com.taskflow.service;

import java.util.List;
import java.util.Optional;

import com.taskflow.model.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department updateDepartment(Department department, Long departmentId);

	void deleteDepartmentById(Long departmentId);
	
	Optional<Department> fetchDepartmentById(Long departmentId);

}
