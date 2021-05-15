package com.loginAndRegisterExampleProgram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginPage {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(@RequestParam String username, @RequestParam String password) {
		UserDAODetails user = (UserDAODetails) new UserDAOImpl();
		if (user.findUser(username, password))
			return "welcome";

		else
			return "login";
	}

}
