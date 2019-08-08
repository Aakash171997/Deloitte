package com.deloitte.mdb.services;

import java.util.List;

import com.deloitte.mdb.model.Movie;

public interface MovieService {

	public void addMovie(Movie movie);
	public boolean deleteMovie(int movieId);
	public void updateMovie(Movie movie);
	public List<Movie> getAllMovies();
	public Movie getMovieById(int movieId);
	public List<Movie> searchMovieByName(String movieName);
	public List<Movie> filterByBudget(Integer min, Integer max);
	public List<Movie> filterByMinBudget(Integer min);
	public List<Movie> filterByMaxBudget(Integer max);
}
