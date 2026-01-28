package com.taskflow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskflow.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	

}
