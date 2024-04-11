package com.kttkpm.movieservice.repository.impl;

import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.repository.CommonDataBaseRepository;
import com.kttkpm.movieservice.repository.MovieRepository;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl extends CommonDataBaseRepository implements MovieRepository {

    /**
     * Tra cuu thong tin film
     * @param movieDTO
     * @return
     */
    @Override
    public ResultSelectEntity findMovie(SearchMovieDTO movieDTO) {
        StringBuilder sql = new StringBuilder();
        List<Object> parrParams = new ArrayList<>();
        sql.append("SELECT ");
        sql.append(" m.id as ID ");
        sql.append(" FROM movie m ");
        sql.append(" WHERE 1 = 1 ");
        if (movieDTO.getTitle()!= null &&!movieDTO.getTitle().isEmpty()) {
            sql.append(" AND m.title = :title ");
            parrParams.add(movieDTO.getTitle());
        }

        Integer start = 0;
        if (movieDTO.getStartRecord() != null) {
            start = movieDTO.getStartRecord();
        }
        Integer pageSize = null;
        if (movieDTO.getPageSize() != null) {
            pageSize = movieDTO.getPageSize();
        }
        System.out.println(sql);

        return getListDataAndCount(sql, parrParams, start, pageSize, MovieEntity.class);
    }
}
