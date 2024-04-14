package com.kttkpm.movieservice.repository.impl;

import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.repository.CommonDataBaseRepository;
import com.kttkpm.movieservice.repository.MovieRepository;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class MovieRepositoryImpl extends CommonDataBaseRepository implements MovieRepository {
    
    @PersistenceContext
    EntityManager entityManager;

    /**
     * Tra cuu thong tin film
     * @param movieDTO
     * @return
     */
    @Override
    @Transactional
    public ResultSelectEntity findMovie(SearchMovieDTO movieDTO) {
        StringBuilder sql = new StringBuilder();
        List<Object> parrParams = new ArrayList<>();
        sql.append("SELECT ");
        sql.append(" a.id as ID ");
        sql.append(" FROM movie m ");
        sql.append(" left join actor a on a.movie_id = m.id ");
        sql.append(" WHERE 1 = 1 ");
        if (movieDTO.getTitle()!= null &&!movieDTO.getTitle().isEmpty()) {
            sql.append(" AND m.title = ? ");
            parrParams.add(movieDTO.getTitle());
        }
        if (movieDTO.getTitle()!= null) {
            sql.append(" AND m.id = ? ");
            parrParams.add(movieDTO.getId());
        }
        System.out.println(sql.toString());

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
