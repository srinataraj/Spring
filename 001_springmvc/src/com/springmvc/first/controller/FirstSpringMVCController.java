package com.springmvc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	@RequestMapping("/hi")
	public String sayHello() {
	return "index";
	}
	@RequestMapping("/hii")
	public String sayHello1() {
		return "emp";
}
	@RequestMapping("/message")
	public String sendMessage(Model m) {
		 m.addAttribute("mymessage","hello from spring mvc model");
		 return "kitchen";
	}
	@RequestMapping("/supermessage")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		 mv.addObject("hello","hellofood");
		 mv.setViewName("canteen");
		 return mv;
	}
}
