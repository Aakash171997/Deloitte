package com.bookflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.models.Users;
import com.bookflix.services.AddUserService;

@Controller
public class UsersController {
	@Autowired
	AddUserService addUserService;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(Model model) {
		model.addAttribute("user", new Users());
		return "SignUp";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";

	}

	@RequestMapping(value = "/api/addUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users user, Model model) {

		if (this.addUserService.addUser(user)) {
			return "redirect:/validate";
		} else {
			model.addAttribute("ErrorUserExists", "<p style = 'color:red'>Email already exists</p>");
			return "SignUp";

		}
	}

}
