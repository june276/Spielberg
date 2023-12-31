package com.project.MovieMania.service;

import com.project.MovieMania.domain.Movie;

import java.util.List;

public interface AdminMovieService {
	int register(Movie movie);
	
	int update(Movie movie);
	
	List<Movie> list();
	
	Movie detail(long id);
	
	int delete(long id);
	
}
