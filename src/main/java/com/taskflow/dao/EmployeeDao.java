package com.taskflow.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskflow.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

	List<Employee> findByDepartment_DepartmentId(Long departmentId);

	List<Employee> findByDepartment_DepartmentName(String departmentName);

	Employee findByEmail(String email);

}
