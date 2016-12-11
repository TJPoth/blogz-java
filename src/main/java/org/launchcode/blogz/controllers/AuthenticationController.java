package org.launchcode.blogz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "base";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signupForm() {
		return "signup";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(value="/newpost", method=RequestMethod.GET)
	public String newpostForm() {
		return "newpost";
	}
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public String blogForm() {
		return "blog2";
	}


}
