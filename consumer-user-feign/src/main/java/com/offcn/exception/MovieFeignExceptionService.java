package com.offcn.exception;

import com.offcn.pojo.Movie;
import com.offcn.service.MovieServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @author Zpf
 * @create 2020-10-21 15:27
 */
@Component
public class MovieFeignExceptionService implements MovieServiceFeign {
    @Override
    public Movie getMovie() {
        Movie movie = new Movie();
        movie.setId(-100);
        movie.setMovieName("暂无这部电影!");
        return movie;
    }
}
