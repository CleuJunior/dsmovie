package com.backend.dsmovie.service;

import com.backend.dsmovie.api.mapper.MovieMapper;
import com.backend.dsmovie.api.response.MovieResponse;
import com.backend.dsmovie.model.Movie;
import com.backend.dsmovie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieResponse> findAll(Pageable pageable) {
         Page<Movie> result = movieRepository.findAll(pageable);
         return result.map(MovieMapper::toMovieResponse);
    }

    @Transactional(readOnly = true)
    public MovieResponse findById(Long id) {
         Movie result = movieRepository.findById(id).get();
         return MovieMapper.toMovieResponse(result);
    }
}
