package com.backend.dsmovie.api.mapper;

import com.backend.dsmovie.api.request.ScoreRequest;
import com.backend.dsmovie.api.response.ScoreResponse;
import com.backend.dsmovie.model.Score;

public class ScoreMapper {

    public static Score toScore(ScoreRequest scoreRequest) {
        Score score = new Score();
        score.setValue(scoreRequest.getScore());
        return score;
    }

    public static ScoreResponse toScoreResponse(Score score) {
        ScoreResponse response = new ScoreResponse();
        response.setMovieId(score.getId().getMovie().getId());
        response.setScore(score.getValue());
        response.setEmail(score.getId().getUser().getEmail());
        return response;
    }
}
