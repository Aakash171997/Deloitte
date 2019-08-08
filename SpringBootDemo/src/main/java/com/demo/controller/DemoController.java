package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/sayMessage")
	public String getMessage() {
		return "Akhand Bhaarat, zindabad!";
	}
	
	@RequestMapping("/byeBye")
	public String getBye() {
		return "Destroy Pakistan";
	}
}
