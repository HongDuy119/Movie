package com.kttkpm.movieservice.service;

import com.kttkpm.movieservice.model.ActorEntity;

import java.util.List;

public interface ActorService {
    ActorEntity create(ActorEntity entity);

    List<ActorEntity> findByMovieId();

}
