package com.bookflix.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Book;
import com.bookflix.models.SearchQuery;
import com.bookflix.models.Users;
import com.bookflix.services.SearchService;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

@Controller
public class SearchController {

	@Autowired
	SearchService searchService;

	@Autowired
	HttpSession httpSession;

	@Autowired
	UsersDAO userDao;

	@RequestMapping("/")
	public String homeRedirect(Model model) {
		return "redirect:/home";
	}

	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("searchQuery", new SearchQuery());
		model.addAttribute("searchResult", null);
		model.addAttribute("searchAreaMessage", "Let's find you a book!");
		String sessionStatus = (String) httpSession.getAttribute("sessionStatus");
		if (sessionStatus != null) {
			Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
			model.addAttribute("userName", user.getUserName());
		}
		return "home";
	}

	@RequestMapping(value = "/searchResults", method = RequestMethod.POST)
	public String searchResults(@ModelAttribute("searchQuery") SearchQuery query, Model model) {
		if (query.toString().equals("") || query.toString() == null || query == null) {
			return "redirect:/home";
		}
		List<Book> searchResult = this.searchService.searchBooks(query);
		model.addAttribute("searchQuery", query);
		model.addAttribute("searchResult", searchResult);
		model.addAttribute("searchAreaMessage", "We could not find a book for you, search something else?");
		System.out.println("Home loaded");
		for (Book book : searchResult) {
			System.out.println(book);
		}
		String sessionStatus = (String) httpSession.getAttribute("sessionStatus");
		if (sessionStatus != null) {
			Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
			model.addAttribute("userName", user.getUserName());
		}
		return "home";
	}
}
