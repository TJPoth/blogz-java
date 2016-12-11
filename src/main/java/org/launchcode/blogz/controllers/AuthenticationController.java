package org.launchcode.blogz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		return "base";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signupForm(Model model) {
		model.addAttribute("pageTitle", "Sign up");
		return "signup";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm(Model model) {
		model.addAttribute("pageTitle", "Log in");
		return "login";
	}
	
	@RequestMapping(value="/newpost", method=RequestMethod.GET)
	public String newpostForm(Model model) {
		model.addAttribute("pageTitle", "New Post");
		return "newpost";
	}
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public String blogForm(Model model) {
		model.addAttribute("pageTitle", "All Posts");
		return "blog2";
	}


}
