package com.kttkpm.movieservice.service;

import com.kttkpm.movieservice.dto.MovieDTO;
import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MovieService {

    MovieEntity create(MovieEntity movie, MultipartFile poster);

    List<MovieEntity> getAllMovies();

    MovieDTO getMovieById(Long id);

    Object searchTreeInfo(SearchMovieDTO dataParams);

    Object deleteById(Long id);
}
