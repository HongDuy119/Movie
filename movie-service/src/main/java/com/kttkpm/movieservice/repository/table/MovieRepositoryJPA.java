package com.kttkpm.movieservice.repository.table;

import com.kttkpm.movieservice.model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepositoryJPA extends JpaRepository<MovieEntity, Long> {

    List<MovieEntity> findAll();

    MovieEntity getById(Long id);

}
