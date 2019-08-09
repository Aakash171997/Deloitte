package com.bookflix.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookflix.models.Book;
import com.bookflix.models.Users;

@Repository("lendDAO")
public interface LendDAO extends CrudRepository<Book, Integer>{

	public Book findByBookRef(int bookRef);
	public List<Book> findByOwnerId(int ownerId);
}
