package com.bookflix.services;

import java.util.List;

import com.bookflix.models.Book;
import com.bookflix.models.SearchQuery;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

public interface SearchService {

	public List<Book> searchBooks(SearchQuery query);
	
}
