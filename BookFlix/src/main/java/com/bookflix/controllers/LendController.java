package com.bookflix.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.models.Book;
import com.bookflix.models.Mapping;
import com.bookflix.models.Users;
import com.bookflix.services.LendService;

@Controller
public class LendController {

	@Autowired
	LendService lendservice;

	@Autowired
	HttpSession httpSess;

	@RequestMapping(value = "/show/{bookRef}")
	public String showBook(@ModelAttribute("bookRef") Integer bookRef, Model model) {
		Book book = lendservice.getBookByRef(bookRef);
		Users user = lendservice.getOwner(book.getOwnerId());
		model.addAttribute("bookname", book.getBookName());
		model.addAttribute("author", book.getAuthors());
		model.addAttribute("owner", user.getUserName());
		model.addAttribute("status", book.getStatus());
		model.addAttribute("location", user.getLocation());
		return "status";
	}

	@RequestMapping(value = "/check/{bookRef}")
	public String checkStatus(@ModelAttribute("bookRef") Integer bookRef, Model model) {
		Book book = lendservice.getBookByRef(bookRef);
		int userId = (int) httpSess.getAttribute("userId");
		Users user = lendservice.getOwner(userId);
		// Mapping mapping = (Mapping) ;
		if (lendservice.checkStatus(book, user)) {
			return "requested";
		}
		return "borrowed";
	}

	@RequestMapping("/borrow")
	public String reqBook(Model model) {
		List<Book> books = lendservice.bookRef();
		List<Mapping> mapping = lendservice.mapRef();
		model.addAttribute("map", mapping);
		return "bookrequest";
	}

	@RequestMapping("/accept/{bookId}")
	public String accept(@ModelAttribute("bookId") Integer bookId, Model model) {
		Book book = lendservice.getBookByRef(bookId);
		lendservice.Borrowed(book);
		return "redirect:/home";

	}

}
