package com.bookflix.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.SearchBookDAO;
import com.bookflix.models.Book;
import com.bookflix.models.SearchQuery;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

import com.bookflix.services.SearchService;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchBookDAO searchOps;
	
	@Override
	public List<Book> searchBooks(SearchQuery query) {
		List<Book> result = new ArrayList<Book>();
		result = searchOps.findByBookNameIgnoreCaseContaining(query.toString());
		result.addAll(searchOps.findByAuthorsIgnoreCaseContaining(query.toString()));
		return result;
	}

}
