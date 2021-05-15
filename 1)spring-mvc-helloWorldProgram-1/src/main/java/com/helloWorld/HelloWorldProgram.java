package com.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldProgram {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	
	public String LoginPageShowing() {
		return "firstfile";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String handleUserLogin() {

		return "helloworld";
	}
}
