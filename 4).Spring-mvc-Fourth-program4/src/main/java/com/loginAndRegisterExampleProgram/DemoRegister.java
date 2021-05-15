package com.loginAndRegisterExampleProgram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoRegister {

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	/*
	 * @ResponseBody
	 */ public String showLoginPage() {
		return "register";
	}

	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String handleUserLogin(@ModelAttribute("model") user u) {

		UserDAODetails user = (UserDAODetails) new UserDAOImpl();
		user.insert(u);
		return "login";
	}

}
