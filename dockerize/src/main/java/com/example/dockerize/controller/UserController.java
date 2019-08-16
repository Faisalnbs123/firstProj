package com.example.dockerize.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping(path="/emp") 
	public String get()
	{
		return "First --- project";
	}
}
