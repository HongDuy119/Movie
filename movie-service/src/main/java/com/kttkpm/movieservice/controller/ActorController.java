package com.kttkpm.movieservice.controller;

import com.kttkpm.movieservice.model.ActorEntity;
import com.kttkpm.movieservice.model.MovieEntity;
import com.kttkpm.movieservice.service.ActorService;
import com.kttkpm.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/actor")
@CrossOrigin
public class ActorController {

    @Autowired
    ActorService actorService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody ActorEntity actor)
    {
        return new ResponseEntity<>(actorService.create(actor), HttpStatus.OK);
    }



}

