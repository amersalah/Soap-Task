/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amer.soap.service;



import com.amer.soap.dal.model.Actor;
import com.amer.soap.dal.model.Movie;
import java.util.ArrayList;
import java.util.List;


public class MovieServiceImpl implements MovieService
{

     static List<Movie> movies = new ArrayList<>();



    @Override
    public List<Movie> findAll()
    {

        Actor actor1 = new Actor(1 , "Smith" , 55);
        Actor actor2 = new Actor(2 , "Johnson" , 30);
        Actor actor3 = new Actor(3 , "Ahmed" , 40);

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        Movie movie1 = new Movie(1 , "AAA" , "Good Movie" , actors);
        Movie movie2 = new Movie(2 , "BBB" , "Bad Movie" , actors);
        Movie movie3 = new Movie(3 , "CCC" , "Very Good Movie" , actors);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);


        return movies;


    }


    @Override
    public Movie findByID(long id)
    {
        List<Movie> movies = findAll();

        for (Movie movie:movies) {
            if(movie.getId() == id)
                return movie;
        }

        throw new RuntimeException("mv001");

    }


    @Override
    public void addMovie(Movie movie)
    {
        movies.add(movie);

    }

    @Override
    public boolean updateMovie(long id , Movie updatedmovie)
    {
        if(findByID(id)!=null)
        {
            for (Movie movie:movies)
                {
                if (movie.getId() == id)
                {
                    movie.getName().equals(updatedmovie.getName());
                    movie.getDesc().equals(updatedmovie.getDesc());
                }
            }
            return true;
        }else {

            throw new RuntimeException("mv002");
        }

    }


    @Override
    public boolean deleteMovie(long id)
    {
        Movie checkmoviefound = findByID(id);
        if(checkmoviefound!=null)
        {
            for(Movie movie : movies)
            {
                if(movie.getId() == id) {
                    movies.remove(movie);
                    break;

                }
            }
            return true;
        }
        throw new RuntimeException("mv003");

    }


}