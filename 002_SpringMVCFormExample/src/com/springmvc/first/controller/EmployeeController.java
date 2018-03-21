package com.springmvc.first.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;

import org.springframework.web.servlet.ModelAndView;

import com.spring.form.employee.EmployeeBean;

@Controller
public class EmployeeController {

	
	public ModelAndView showform() {
		// command is a reserved request attribute name, now use <form> tag to show
		// object data
		return new ModelAndView("employeeform", "command", new EmployeeBean());
	}

	
	public ModelAndView save(@ModelAttribute("emp") EmployeeBean emp) {
		// write code to save emp object
		// here, we are displaying emp object to prove emp has data
		System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());

		// return new ModelAndView("empform","command",emp);//will display object data
		return new ModelAndView("redirect:/viewemp");// will redirect to viewemp request mapping
	}

	
	public ModelAndView viewemp() {
		// write the code to get all employees from DAO
		// here, we are writing manual code of list for easy understanding
		List<EmployeeBean> list = new ArrayList<EmployeeBean>();
		list.add(new EmployeeBean(1, "rahul", 35000f, "S.Engineer"));
		list.add(new EmployeeBean(2, "aditya", 25000f, "IT Manager"));
		list.add(new EmployeeBean(3, "sachin", 55000f, "Care Taker"));

		return new ModelAndView("viewemp", "list", list);
	}
}
