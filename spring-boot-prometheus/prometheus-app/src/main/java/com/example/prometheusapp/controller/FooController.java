package com.example.prometheusapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sarp on 8/21/17.
 */

@RestController
@RequestMapping(value = "/greeting")
public class FooController {

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("greeting");
    }
}
