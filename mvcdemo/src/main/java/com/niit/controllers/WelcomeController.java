package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	public WelcomeController(){
		System.out.println("welcomeController bean is created...");
	}
	
	
	@RequestMapping(value="/welcome")
	public String welcomeMessage(Model model){
		model.addAttribute("welcomeAttr","Welcome to Spring MVC framework!!!");
		return "welcomepage";
	}
	@RequestMapping("/hi")
	public String sayHi(Model model){
		model.addAttribute("hiAttr","Hi.....!!!");
		return "hipage";
	}
}