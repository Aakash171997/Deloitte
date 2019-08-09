package com.bookflix.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.models.Login;
import com.bookflix.models.Users;
import com.bookflix.services.LoginDetailsService;

@Controller
public class LoginController {
	@Autowired
	LoginDetailsService ldse;

	@Autowired
	HttpSession httpSession;

	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public String validateUser(Model model) {
		model.addAttribute("login", new Login());
		return "Login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutUser(Model model) {
		httpSession.invalidate();
		return "logout";

	}

	@RequestMapping(value = "/validate/check", method = RequestMethod.POST)
	public String checkuser(@ModelAttribute("login") Login login, Model model) {

		if (this.ldse.validateuser(login)) {

			return "redirect:/home";

		} else {
			model.addAttribute("ErrorLogin", "<p style='color:red'>Incorrect Email or Password</p>");
			return "Login";
		}
	}

}
