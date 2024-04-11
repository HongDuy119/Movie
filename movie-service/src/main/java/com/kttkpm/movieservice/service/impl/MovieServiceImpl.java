package com.kttkpm.movieservice.service.impl;

import com.kttkpm.movieservice.dto.MovieDTO;
import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.ActorEntity;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.repository.MovieRepository;
import com.kttkpm.movieservice.repository.table.ActorRepositoryJPA;
import com.kttkpm.movieservice.repository.table.MovieRepositoryJPA;
import com.kttkpm.movieservice.service.MovieService;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepositoryJPA movieRepositoryJPA;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ActorRepositoryJPA actorRepository;
    @Override
    public MovieEntity create(MovieEntity movie) {
        return movieRepositoryJPA.save(movie);
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return movieRepositoryJPA.findAll();
    }

    @Override
    public MovieDTO getMovieById(Long id) {

        List<ActorEntity> actorEntitys = actorRepository.findByMovieId(id);
        MovieEntity movie = movieRepositoryJPA.getById(id);
        MovieDTO movieDTO = new MovieDTO(movie, actorEntitys);
        movieDTO.setActors(actorEntitys);
        return movieDTO;
    }

    @Override
    public Object searchTreeInfo(SearchMovieDTO dataParams) {
        ResultSelectEntity dataMovie = movieRepository.findMovie(dataParams);
        return dataMovie;
    }
}
