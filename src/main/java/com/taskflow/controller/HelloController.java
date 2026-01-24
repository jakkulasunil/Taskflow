package com.taskflow.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class HelloController {

	@GetMapping("/hello/{message}")
	public String getMessage(@PathVariable("message") String message) {
		return "Hello " + message.toUpperCase() + " Welcome to springboot";
	}

	@GetMapping("/hello")
	public String messgage() {
		return "Hello Welcome to Spring boot and React application";
	}

}
