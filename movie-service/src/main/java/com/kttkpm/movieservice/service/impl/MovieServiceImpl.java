package com.kttkpm.movieservice.service.impl;

import com.kttkpm.movieservice.dto.MovieDTO;
import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.ActorEntity;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.repository.MovieRepository;
import com.kttkpm.movieservice.repository.table.ActorRepositoryJPA;
import com.kttkpm.movieservice.repository.table.MovieRepositoryJPA;
import com.kttkpm.movieservice.service.MovieService;
import com.kttkpm.movieservice.until.common.FunctionCommon;
import com.kttkpm.movieservice.until.common.ResultSelectEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    MovieRepositoryJPA movieRepositoryJPA;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ActorRepositoryJPA actorRepository;
    @Override
    public MovieEntity create(MovieEntity movie, MultipartFile poster) {
        try {
            if(poster!=null && poster.getOriginalFilename()!=null && poster.getOriginalFilename().length()>0){
                String urlPoster = FunctionCommon.convertFileToFolder(poster);
                movie.setUrlPoster(urlPoster);
            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
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

    @Override
    public Object deleteById(Long id) {
        Map<String, Object> result = new HashMap<>();
        try {
            movieRepositoryJPA.deleteById(id);
            result.put("description","success");
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            result.put("description",e.getMessage());
        }
        return result;
    }
}
