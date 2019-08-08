package com.deloitte.mdb.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.mdb.dao.MovieDAO;
import com.deloitte.mdb.model.Movie;
import com.deloitte.mdb.services.MovieService;

@Service("mdbService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO mdbOps;
	
	@Override
	public void addMovie(Movie movie) {
		mdbOps.save(movie);

	}

	@Override
	public boolean deleteMovie(int movieId) {
		Movie movie = new Movie();
		movie.setMovieId(movieId);
		mdbOps.delete(movie);
		return true;

	}

	@Override
	public void updateMovie(Movie movie) {
		mdbOps.save(movie);

	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> allMovies = (List<Movie>) mdbOps.findAll();
		return allMovies;
	}

	@Override
	public Movie getMovieById(int movieId) {
		Optional<Movie> optional = mdbOps.findById(movieId);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Movie> searchMovieByName(String movieName) {
		List<Movie> result = mdbOps.findByMovieName(movieName);
		return result;
	}

	@Override
	public List<Movie> filterByBudget(Integer min, Integer max) {
		List<Movie> result = mdbOps.findByBudgetBetween(min, max);
		return result;
	}

	@Override
	public List<Movie> filterByMinBudget(Integer min) {
		return mdbOps.findByBudgetGreaterThan(min);
	}

	@Override
	public List<Movie> filterByMaxBudget(Integer max) {
		return mdbOps.findByBudgetLessThan(max);
	}

}
