package com.springboot.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafController {
	@RequestMapping("/index")
	public String welcome() {
		return "index";
	}
	

}
