package com.example.movieclient.service;

import com.example.movieclient.model.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieClient {

    private final RestTemplate restTemplate;

    public MovieClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie() {

        Movie movie = this.restTemplate.getForObject("/api/movie", Movie.class);

        return movie;
    }

}
