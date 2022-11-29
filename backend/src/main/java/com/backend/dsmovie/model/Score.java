package com.backend.dsmovie.model;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
@Data
public class Score {

    @EmbeddedId
    private final ScorePK id = new ScorePK();
    private Double value;

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }

}
