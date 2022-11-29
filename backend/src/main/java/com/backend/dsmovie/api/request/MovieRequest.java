package com.backend.dsmovie.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MovieRequest {

    @JsonProperty("_id")
    private Long id;

    @JsonProperty("movie_title")
    private String title;

    @JsonProperty("movie_score")
    private Double score;

    @JsonProperty("movie_count")
    private Integer count;

    @JsonProperty("url_image")
    private String image;


}
