package com.kttkpm.movieservice.repository.impl;

import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.repository.MovieRepository;
import com.kttkpm.movieservice.until.common.FunctionCommon;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.*;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
    
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


    public ResultSelectEntity getListDataAndCount(StringBuilder queryString, List<Object> arrParams, Integer startPage, Integer pageLoad, Class<?> classOfT) {
        try {
            boolean databaseIsOracle = false;

            String strVersionOracle;
            try {
                HikariDataSource hikariDataS = (HikariDataSource)this.entityManager.getEntityManagerFactory().getProperties().get("hibernate.connection.datasource");
                strVersionOracle = hikariDataS.getDriverClassName().toLowerCase();
                if (strVersionOracle.contains("oracle")) {
                    databaseIsOracle = true;
                }
            } catch (Exception var13) {
            }

            StringBuilder sqlPage = new StringBuilder();
            if (databaseIsOracle && startPage != null && pageLoad != null) {
                sqlPage.append(" SELECT * FROM ( SELECT a.*, rownum r__  FROM (");
                sqlPage.append(queryString.toString());
                sqlPage.append(" ) a ) ");
                sqlPage.append(String.format(" WHERE r__ > %d", startPage));
                sqlPage.append(String.format(" and r__ <= %d", startPage + pageLoad));

            } else {
                sqlPage = queryString;
            }

            Query query = this.entityManager.createNativeQuery(sqlPage.toString(), Tuple.class);
            int countParams = 1;
            if (arrParams != null) {
                for(Iterator var10 = arrParams.iterator(); var10.hasNext(); ++countParams) {
                    Object arrParam = var10.next();
                    query.setParameter(countParams, arrParam);
                }
            }

            if (startPage != null && pageLoad != null && !databaseIsOracle) {
                query.setFirstResult(startPage).setMaxResults(pageLoad);
            }

            List objectList = query.getResultList();
            ResultSelectEntity result = new ResultSelectEntity();
            if (objectList != null) {
                List<Object> listResult = FunctionCommon.convertToEntity(objectList, classOfT);
                result.setListData(listResult);
            }

            this.entityManager.close();
            return result;
        } catch (NumberFormatException var14) {
            return null;
        }
    }
}
