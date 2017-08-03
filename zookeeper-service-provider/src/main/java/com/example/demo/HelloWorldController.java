package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/name")
	public String name() {
		return "You are Digão";
	}

}
