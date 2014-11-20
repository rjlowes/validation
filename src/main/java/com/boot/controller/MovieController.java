package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
    /*
    private MovieRepository movieRepository;
    
    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> index() {
        return movieRepository.findAll();
    }
    
    @RequestMapping(value = "/movies/{movieId}", method = RequestMethod.GET)
    public Movie show(@PathVariable("movieId") Long movieId) {
        return movieRepository.findOne(movieId);
    }
    
    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }
    
    @RequestMapping(value = "/movies/{movieId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Movie movie, @PathVariable("movieId") Long movieId) {
        // Little bit hacky
        Movie current = movieRepository.findOne(movieId);
        current.copyMovie(movie);
        movieRepository.save(current);
    }
    
    @RequestMapping(value = "/movies/{movieId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("movieId") Long movieId) {
        movieRepository.delete(movieId);
    }
    */
}
