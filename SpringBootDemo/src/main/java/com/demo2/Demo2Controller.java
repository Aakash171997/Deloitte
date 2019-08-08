package com.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

	@RequestMapping("/HuHa")
	public String huHa() {
		return "Hu Ha";
	}
}
