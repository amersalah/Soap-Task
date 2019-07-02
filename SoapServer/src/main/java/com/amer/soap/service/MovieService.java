/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amer.soap.service;

import com.amer.soap.dal.model.Movie;
import java.util.List;

/**
 *
 * @author Amer Salah
 */
public interface MovieService {
    
    public List<Movie> findAll();
    public Movie findByID(long id);
    public void addMovie(Movie movie);
    public boolean updateMovie(long id , Movie updatedmovie);
    public boolean deleteMovie(long id);
    
}
