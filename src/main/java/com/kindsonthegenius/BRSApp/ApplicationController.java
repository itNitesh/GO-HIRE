package com.kindsonthegenius.BRSApp;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindsonthegenius.BRSApp.services.EmployeeService;

@Controller
public class ApplicationController {
	
	@Autowired private EmployeeService employeeService;
	
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}	
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/profile")
	public String profile(Model model, Principal principal) {
		String un=principal.getName();
		model.addAttribute("employee", employeeService.findByUsername(un));
		return "profile";
		}

}
