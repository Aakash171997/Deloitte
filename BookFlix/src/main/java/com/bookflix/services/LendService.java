package com.bookflix.services;

import java.util.List;

import com.bookflix.models.Book;
import com.bookflix.models.Mapping;
import com.bookflix.models.Users;

public interface LendService {
	public Boolean checkStatus(Book book,Users user);
	public Book getBookByRef(Integer bookRef);
	public Users getOwner(Integer ownerId);
	public List<Book> bookRef();
	public List<Mapping> mapRef();
	public void Borrowed(Book book);
}
