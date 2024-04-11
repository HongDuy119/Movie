package com.kttkpm.movieservice.service;

import com.kttkpm.movieservice.dto.MovieDTO;
import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;

import java.util.List;

public interface MovieService {

    MovieEntity create(MovieEntity movie);

    List<MovieEntity> getAllMovies();

    MovieDTO getMovieById(Long id);

    Object searchTreeInfo(SearchMovieDTO dataParams);
}
