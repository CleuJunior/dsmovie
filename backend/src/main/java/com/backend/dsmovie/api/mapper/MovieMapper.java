package com.backend.dsmovie.api.mapper;

import com.backend.dsmovie.api.request.MovieRequest;
import com.backend.dsmovie.api.response.MovieResponse;
import com.backend.dsmovie.model.Movie;

public class MovieMapper {

    public static Movie toMovie(MovieRequest movieRequest) {
        Movie movie = new Movie();
        movie.setId(movieRequest.getId());
        movie.setTitle(movieRequest.getTitle());
        movie.setScore(movieRequest.getScore());
        movie.setCount(movieRequest.getCount());
        movie.setImage(movieRequest.getImage());
        return movie;
    }

    public static MovieResponse toMovieResponse(Movie movie) {
        MovieResponse response = new MovieResponse();
        response.setId(movie.getId());
        response.setTitle(movie.getTitle());
        response.setScore(movie.getScore());
        response.setCount(movie.getCount());
        response.setImage(movie.getImage());
        return response;
    }
}
