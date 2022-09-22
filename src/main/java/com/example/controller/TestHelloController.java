package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

	@RequestMapping("/hello")
	public String testHello() 
	{
		return "Hello Welcome!!";
	}
	
	@RequestMapping("/home")
	public String testHome() 
	{
		return "You're in home page";
	}
}
