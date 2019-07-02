/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amer.soap.service;

import com.amer.soap.dal.model.Movie;
import com.amer.soap.service.MovieServiceImpl;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Amer Salah
 */
@WebService(serviceName = "MovieService" , targetNamespace = "http://service.soap.amer.com/")
public class MovieServiceEndPoint {
    
    
    private MovieServiceImpl movieService;

    @Autowired
    public void setMovieService(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }
    
    
    public MovieServiceEndPoint(){}
    

    public MovieServiceEndPoint(MovieServiceImpl serviceImpl)
    {
        this.movieService = serviceImpl;
    }
    
    
    @WebMethod
    public List<Movie> findAll()
    {
        return movieService.findAll();
    }
    
    @WebMethod
    public Movie findByID(long id)
    {
        return movieService.findByID(id);
    }
    
    @WebMethod
    public void addMovie(Movie movie)
    {
        movieService.addMovie(movie);
    }
    
    @WebMethod
    public boolean updateMovie(long id , Movie updatedmovie)
    {
        return movieService.updateMovie(id, updatedmovie);
    }
    
    @WebMethod
    public boolean deleteMovie(long id)
    {
        return movieService.deleteMovie(id);
    }
    
}
