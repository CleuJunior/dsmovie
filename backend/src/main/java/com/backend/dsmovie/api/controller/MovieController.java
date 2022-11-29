package com.backend.dsmovie.api.controller;

import com.backend.dsmovie.api.response.MovieResponse;
import com.backend.dsmovie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieResponse> findMovieById(@PathVariable Long id) {
        MovieResponse response = movieService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<Page<MovieResponse>> listOfMovies(Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.findAll(pageable));
    }

}
