package com.offcn.controller;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zpf
 * @create 2020-10-21 11:43
 */
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("movie")
    public Movie getMovie(){
        return movieService.getMovie();
    }
}
