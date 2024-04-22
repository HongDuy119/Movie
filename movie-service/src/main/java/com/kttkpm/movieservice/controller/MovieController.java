package com.kttkpm.movieservice.controller;


import com.kttkpm.movieservice.dto.SearchMovieDTO;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.service.MovieService;
import com.kttkpm.movieservice.until.common.FunctionCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/movies")
//@CrossOrigin
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> create(@RequestPart(value = "dataParams") MovieEntity dataParams, @RequestPart(value = "poster", required = false) MultipartFile poster)
    {
        return new ResponseEntity<>(movieService.create(dataParams, poster), HttpStatus.OK);
    }


    @GetMapping(value = "/all")
    public ResponseEntity<Object> getAll()
    {
        return new ResponseEntity<>(FunctionCommon.responseToClient(movieService.getAllMovies()), HttpStatus.OK);
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAll(SearchMovieDTO dataParams)
    {
        Object resultObj = movieService.searchTreeInfo(dataParams);
        return new ResponseEntity<>(FunctionCommon.responseToClient(resultObj), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getById(@PathVariable Long id)
    {
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteById(@PathVariable Long id)
    {
        return new ResponseEntity<>(FunctionCommon.responseToClient(movieService.deleteById(id)), HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Object> update(@PathVariable Long id)
//    {
//        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
//    }

}
