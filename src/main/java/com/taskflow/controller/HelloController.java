package com.taskflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello/{message}")
	public String getMessage(@PathVariable("message") String message) {
		return "Hello " + message.toUpperCase() + " Welcome to springboot";
	}

	@GetMapping("/")
	public String messgage() {
		return "Hello";
	}

}
