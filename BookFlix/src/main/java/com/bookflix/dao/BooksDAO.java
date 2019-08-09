package com.bookflix.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookflix.models.Book;

public interface BooksDAO extends CrudRepository<Book, Integer> {

	public List<Book> findByOwnerId(Integer ownerId);
}
