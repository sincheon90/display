package com.ojk.display.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/index")
	public String add() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/aabb")
	public String adfbb() {
		return "aabb";
	}
}
