package com.taskflow.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taskflow.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{
	
	

}
