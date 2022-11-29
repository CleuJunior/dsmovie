package com.backend.dsmovie.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonPropertyOrder({"_id"})
public class MovieResponse {

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
