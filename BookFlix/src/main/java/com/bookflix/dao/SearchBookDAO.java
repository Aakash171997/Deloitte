package com.bookflix.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookflix.models.Book;

@Repository("searchOps")
public interface SearchBookDAO extends CrudRepository<Book, Integer>{

	public List<Book> findByBookNameIgnoreCaseContaining(String query);
	public List<Book> findByAuthorsIgnoreCaseContaining(String query);
}
