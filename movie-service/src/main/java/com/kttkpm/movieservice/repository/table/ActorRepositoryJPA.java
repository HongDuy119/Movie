package com.kttkpm.movieservice.repository.table;

import com.kttkpm.movieservice.model.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepositoryJPA extends JpaRepository<ActorEntity, Long> {

    List<ActorEntity> findByMovieId(Long id);
}
