package com.backend.dsmovie.repository;

import com.backend.dsmovie.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
