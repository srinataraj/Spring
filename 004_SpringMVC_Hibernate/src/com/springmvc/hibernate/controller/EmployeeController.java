package com.springmvc.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
		
	}


 
 
}
