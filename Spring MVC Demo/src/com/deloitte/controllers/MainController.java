package com.deloitte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/apple")
	public ModelAndView apple() {
		ModelAndView view = new ModelAndView();
		view.addObject("message", "Balls..!");
		view.setViewName("sayHello");
		return view;
	}
}
