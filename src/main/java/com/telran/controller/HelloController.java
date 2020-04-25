package com.telran.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
	
	@GetMapping("/")
	public String index() {
		return "Hello there! I'm running.";
	}
}
