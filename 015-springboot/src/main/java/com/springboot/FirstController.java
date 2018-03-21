package com.springboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello from spring boot";
	}
}
