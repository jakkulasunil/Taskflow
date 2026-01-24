package com.taskflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.model.User;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user) {

		System.out.println("User registered " + user.getUsername());
		return ResponseEntity.ok("User Registered Successfully");
	}

}
