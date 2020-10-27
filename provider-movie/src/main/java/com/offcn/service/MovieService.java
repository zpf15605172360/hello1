package com.offcn.service;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Zpf
 * @create 2020-10-21 11:42
 */
@Service
public class MovieService {
    @Autowired
    private MovieDao movieDao;
    @Value("${server.port}")
    private String port;
    public Movie getMovie(){
        System.out.println("当前电影服务的端口为:"+port);
        return movieDao.getMovie();
    }
}
