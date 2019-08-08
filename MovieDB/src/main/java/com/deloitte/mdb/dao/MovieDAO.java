package com.deloitte.mdb.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.mdb.model.Movie;

@Repository("mdbOps")
public interface MovieDAO extends CrudRepository<Movie, Integer>{

	public List<Movie> findByMovieName(String movieName);
	public List<Movie> findByBudgetBetween(int min, int max);
	public List<Movie> findByBudgetGreaterThan(int min);
	public List<Movie> findByBudgetLessThan(int max);
}
