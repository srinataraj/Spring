package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	@RequestMapping("/hello")

	public String sayHello() {
		return "Hello";
				
	}
		

}
