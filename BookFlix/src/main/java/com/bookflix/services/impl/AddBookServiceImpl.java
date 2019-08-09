package com.bookflix.services.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.BooksDAO;
import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Book;
import com.bookflix.models.Users;
import com.bookflix.services.AddBookService;
@Service
public class AddBookServiceImpl implements AddBookService {
	@Autowired
	BooksDAO bookDAO;
	
	@Autowired
	UsersDAO userDao;
	
	@Autowired
	HttpSession httpSession;

	@Override
	public void addBooks(Book book) {
		Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
		book.setOwnerId((int) httpSession.getAttribute("userId"));
		book.setStatus("AVAILABLE");
		book.setLessieId(0);
		user.addToLibrary(book);
		userDao.save(user);
		
	}

	@Override
	public List<Book> allBooksByUser() {
		Users user = userDao.findById((int) httpSession.getAttribute("userId")).get();
		
		return (List<Book>) bookDAO.findByOwnerId(user.getUserId());
	}

}
