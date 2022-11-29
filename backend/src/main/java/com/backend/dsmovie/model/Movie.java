package com.backend.dsmovie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_movie")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private Double score;

    @Getter
    @Setter
    private Integer count;

    @Getter
    @Setter
    private String image;

    @Getter
    @OneToMany(mappedBy = "id.movie")
    private Set<Score> scores = new HashSet<>();

}
