package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

/**
 * @author Zpf
 * @create 2020-10-21 11:41
 */
@Repository
public class MovieDao {
    public Movie getMovie(){
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("姜子牙");
        return movie;
    }
}
