package com.bookflix.services;

import java.util.List;

import com.bookflix.models.Book;

public interface AddBookService {
	
	public void addBooks(Book book);
	public List<Book> allBooksByUser();
}
