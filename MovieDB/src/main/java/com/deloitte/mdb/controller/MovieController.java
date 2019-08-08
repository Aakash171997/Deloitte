package com.deloitte.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.mdb.model.Movie;
import com.deloitte.mdb.services.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService mdbService;
	
	@RequestMapping("/addMovieForm")
	public String addMovieForm(Model model) {
		model.addAttribute("movie", new Movie());
		return "addMovieForm";
	}
	
	@RequestMapping("/api/saveMovie")
	public String saveMovie() {
		Movie movie = new Movie(2, "Harry Porter", "Yates", 50);
		mdbService.addMovie(movie);
		return "Movie Saved";
	}
	
	@RequestMapping("/api/getById/{mid}")
	public Movie getMovieById(@PathVariable("mid") Integer movieId) {
		Movie movie = mdbService.getMovieById(movieId);
		return movie;
	}
	
	@RequestMapping("/api/deleteById/{mid}")
	public String deleteMovie(@PathVariable("mid") Integer movieId) {
		if(mdbService.deleteMovie(movieId)) {
			return "Movie Deleted";
		} else {
			return "Delete Failed";
		}
	}
	
	@RequestMapping("/api/updateMovie")
	public String updateMovie() {
		Movie movie = new Movie(1,  "Dunkirk", "Christopher Nolan", 100);
		mdbService.updateMovie(movie);
		return "Movie Updated";
	}
	
	@RequestMapping("/api/allMovies")
	public List<Movie> allMovies() {
		List<Movie> allMovies = mdbService.getAllMovies();
		
		return allMovies;
	}
	
	@RequestMapping("/api/searchMovie/{keyword}")
	public List<Movie> searchMovie(@PathVariable("keyword") String movieName){
		List<Movie> result = mdbService.searchMovieByName(movieName);
		
		return result;
	}
	
	@RequestMapping("/api/filter/budget/{min}/{max}")
	public List<Movie> filterByBudget(@PathVariable("min") Integer min, @PathVariable("max") Integer max){
		return (List<Movie>) mdbService.filterByBudget(min, max);
	}
	
	@RequestMapping("/api/filter/{by}/budget/{minmax}")
	public List<Movie> filterByBudget(@PathVariable("by") String sortType, @PathVariable("minmax") Integer minmax){
		if(sortType.equals("min")) {
			return (List<Movie>) mdbService.filterByMinBudget(minmax);
		} else if(sortType.equals("max")) {
			return (List<Movie>) mdbService.filterByMaxBudget(minmax);
		} else {
			return null;
		}
	}
	
}
