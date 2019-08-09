package com.bookflix.services.impl;

import java.util.ArrayList; 
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.LendDAO;
import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Book;
import com.bookflix.models.Mapping;
import com.bookflix.models.Users;
import com.bookflix.services.LendService;

@Service("lendservice")
public class LendServiceImpl implements LendService{

	@Autowired
	LendDAO lendDAO;
	
	@Autowired
	UsersDAO userDAO;
	
	@Autowired
	HttpSession httpSess;
	

	
	List<Mapping> map = new ArrayList<Mapping>();
	
	@Override
	public Boolean checkStatus(Book book,Users user) {
		int id = book.getLessieId();
		Mapping mapping = new Mapping();
		if(id == 0) {
			book.setLessieId(user.getUserId());
			book.setStatus("Request");
			lendDAO.save(book);
			mapping.setBookId(book.getBookRef());
			mapping.setOwnerId(book.getOwnerId());
			mapping.setLessieId(user.getUserId());
			mapping.setBookName(book.getBookName());
			mapping.setLessieName(user.getUserName());
			map.add(mapping);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public Book getBookByRef(Integer bookRef) {
		Book book = lendDAO.findByBookRef(bookRef);
		return book;
	}

	@Override
	public Users getOwner(Integer ownerId) {
		return userDAO.findByUserId(ownerId);
	}

	@Override
	public List<Book> bookRef() {
		int userId = (int) httpSess.getAttribute("userId");
		List<Book> books = new ArrayList<Book>();
		books = lendDAO.findByOwnerId(userId);
		List<Book> rqbk = new ArrayList<Book>();
		for(Book book:books) {
			if(book.getLessieId() != 0) {
				rqbk.add(book);
			}
		}
		return rqbk;
	}
	
	@Override
	public List<Mapping> mapRef(){
		return map;
	}

	@Override
	public void Borrowed(Book book) {
		book.setStatus("Borrowed");	
		lendDAO.save(book);
	}


	
}
