package com.backend.dsmovie.api.controller;

import com.backend.dsmovie.api.request.ScoreRequest;
import com.backend.dsmovie.api.response.MovieResponse;
import com.backend.dsmovie.service.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/scores")
@RequiredArgsConstructor
public class ScoreController {
    private final ScoreService scoreService;

    @PutMapping()
    public ResponseEntity<MovieResponse> saveScore(@RequestBody ScoreRequest request) {
        MovieResponse response = scoreService.saveScore(request);
        return ResponseEntity
                .ok()
                .body(response);
    }

}
