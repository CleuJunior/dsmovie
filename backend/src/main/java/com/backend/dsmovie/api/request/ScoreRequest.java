package com.backend.dsmovie.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoreRequest {

    @JsonProperty("movie_id")
    private Long movieId;

    @JsonProperty("user_email")
    private String email;

    @JsonProperty("movie_score")
    private Double score;
}
