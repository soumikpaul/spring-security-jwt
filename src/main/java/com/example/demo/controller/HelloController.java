package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@PostMapping("/login")
	public String login() {
	    return "Successfully logged in";
	}


}
