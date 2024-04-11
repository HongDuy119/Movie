package com.kttkpm.movieservice.repository;

import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;

public interface MovieRepository {

    ResultSelectEntity findMovie(SearchMovieDTO movieDTO);
}
