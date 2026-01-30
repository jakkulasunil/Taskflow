package com.taskflow.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskflow.model.Signup;

public interface SignUpRepository extends JpaRepository<Signup, Long> {

	boolean existsByEmail(String email);

}
