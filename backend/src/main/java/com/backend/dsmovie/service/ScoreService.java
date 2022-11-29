package com.backend.dsmovie.service;

import com.backend.dsmovie.api.mapper.MovieMapper;
import com.backend.dsmovie.api.request.ScoreRequest;
import com.backend.dsmovie.api.response.MovieResponse;
import com.backend.dsmovie.model.Movie;
import com.backend.dsmovie.model.Score;
import com.backend.dsmovie.model.User;
import com.backend.dsmovie.repository.MovieRepository;
import com.backend.dsmovie.repository.ScoreRepository;
import com.backend.dsmovie.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScoreService {
    private final MovieRepository movieRepository;
    private final UserRepository userRepository;
    private final ScoreRepository scoreRepository;

    @Transactional
    public MovieResponse saveScore(ScoreRequest request) {
        User user = userRepository.findByEmail(request.getEmail());

        if(user == null) {
            user = new User();
            user.setEmail(request.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(request.getMovieId()).get();
        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(request.getScore());
        scoreRepository.saveAndFlush(score);
        double sum = 0.0;

        for(Score s : movie.getScores()) {
           sum += s.getValue();
        }

        double avg = sum / movie.getScores().size();
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());
        movieRepository.save(movie);
        return MovieMapper.toMovieResponse(movie);

    }

}
