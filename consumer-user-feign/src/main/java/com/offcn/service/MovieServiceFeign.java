package com.offcn.service;

import com.offcn.exception.MovieFeignExceptionService;
import com.offcn.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Zpf
 * @create 2020-10-21 13:07
 */
@FeignClient(value = "PROVIDERMOVIE",fallback = MovieFeignExceptionService.class)
public interface MovieServiceFeign {
    @GetMapping("/movie")
    public Movie getMovie();
}
