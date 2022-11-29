package com.backend.dsmovie.repository;

import com.backend.dsmovie.model.ScorePK;
import com.backend.dsmovie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, ScorePK> {

    User findByEmail(String email);
}
