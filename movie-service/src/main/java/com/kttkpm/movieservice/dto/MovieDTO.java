package com.kttkpm.movieservice.dto;

import com.kttkpm.movieservice.model.ActorEntity;
import com.kttkpm.movieservice.model.MovieEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MovieDTO extends MovieEntity {

    private List<ActorEntity> actors;

    public MovieDTO(MovieEntity movie,List<ActorEntity> actors) {
//        super(movie.getId(), movie.getTitle(), movie.getDirector(), movie.getGenre(), movie.getDescription(),
//                movie.getCreateUser(),movie.getc(), movie.getUpdateAt(), movie.getUrlImg(), movie.getStatus());
//        this.actors = actors;
    }

}
