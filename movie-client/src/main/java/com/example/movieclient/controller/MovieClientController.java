package com.example.movieclient.controller;

import com.example.movieclient.model.Movie;
import com.example.movieclient.service.MovieClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class MovieClientController {

    private final MovieClient movieClient;

    public MovieClientController(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @GetMapping
    public ResponseEntity<Movie> getMovie() {
        return ResponseEntity.ok(this.movieClient.getMovie());
    }
}
