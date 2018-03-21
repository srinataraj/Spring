package com.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleaf {
	@RequestMapping("/index")
	public String welcome() {
		return "index";
	}
	

}
