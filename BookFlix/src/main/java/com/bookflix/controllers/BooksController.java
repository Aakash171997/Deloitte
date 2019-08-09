package com.bookflix.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.dao.BooksDAO;
import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Book;
import com.bookflix.models.Users;
import com.bookflix.services.AddBookService;

@Controller
public class BooksController {

	@Autowired
	AddBookService bookOps;
	
	@Autowired
	HttpSession httpSession;
	
	@Autowired
	UsersDAO userDao;
	
	@Autowired
	BooksDAO booksDao;
	
	@RequestMapping(value= "/addBook", method = RequestMethod.GET)
	public String addBook(Model model) {
		model.addAttribute("book",new Book());
		model.addAttribute("message", null);
		String sessionStatus = (String) httpSession.getAttribute("sessionStatus");
		if(sessionStatus != null) {
			Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
			model.addAttribute("userName", user.getUserName());
			
			return "addBook";
		} else {
			return "redirect:/validate";
		}
	}
	
	@RequestMapping(value = "/api/addBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book, Model model) {
		String sessionStatus = (String) this.httpSession.getAttribute("sessionStatus");
		if(sessionStatus != null) {
			Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
			model.addAttribute("userName", user.getUserName());
			
			this.bookOps.addBooks(book);
			model.addAttribute("book", book);
			model.addAttribute("message", "Book added successfully!");
			return "addBook";
		} else {
			return "redirect:/validate";
		}
		
	}
	
	@RequestMapping(value="/myBooks")
	public String myBooks(Model model) {
		String sessionStatus = (String) this.httpSession.getAttribute("sessionStatus");
		if(sessionStatus != null) {
			Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
			model.addAttribute("userName", user.getUserName());
			
			List<Book> allBooks = bookOps.allBooksByUser();
			
			model.addAttribute("allBooks", allBooks);
		}
		return "myBooks";
	}
	
	@RequestMapping(value="/modify/{bid}")
	public String modify(@ModelAttribute("bid")Integer bookRef, Model model) {
		Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
		model.addAttribute("userName", user.getUserName());
		Book book = booksDao.findById(bookRef).get();
		model.addAttribute("book", book);
		model.addAttribute("message", null);
		return "modify";
	}
	
	@RequestMapping(value="/api/modifyBook/{bid}", method=RequestMethod.POST)
	public String modifyBook(@ModelAttribute("bid") Integer bookRef, @ModelAttribute("book") Book book, Model model) {
		Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
		model.addAttribute("userName", user.getUserName());
		book.setBookRef(bookRef);
		book.setOwnerId(user.getUserId());
		booksDao.save(book);
		model.addAttribute("book", book);
		model.addAttribute("message", "Book Modified!");
		return "modify";
	}
	
	@RequestMapping(value="/delete/{bid}")
	public String removeBook(@ModelAttribute("bid") Integer bookRef, Model model) {
		Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
		model.addAttribute("userName", user.getUserName());
		Book book = booksDao.findById(bookRef).get();
		booksDao.delete(book);
		return "redirect:/myBooks";
	}

}
