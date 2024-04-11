package com.kttkpm.movieservice.service.impl;

import com.kttkpm.movieservice.model.ActorEntity;
import com.kttkpm.movieservice.repository.table.ActorRepositoryJPA;
import com.kttkpm.movieservice.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepositoryJPA repositoryJPA;

    @Override
    public ActorEntity create(ActorEntity entity) {
        return repositoryJPA.save(entity);
    }

    @Override
    public List<ActorEntity> findByMovieId() {
        return null;
    }
}
