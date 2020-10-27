package com.offcn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zpf
 * @create 2020-10-21 12:32
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Integer id){
        return userDao.getUser(id);
    }

    @HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")
    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> result=new HashMap<>();
        User user = this.getUser(id);
        result.put("user",user);
        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie", Movie.class);
        result.put("movie",movie);
        return result;
    }

    public Map<String,Object> buyMovieFallbackMethod(Integer id){
        User user = new User();
        user.setId(-1);
        user.setUserName("未知用户");
        Movie movie = new Movie();
        movie.setId(-100);
        movie.setMovieName("暂无此电影");
        Map<String,Object> result=new HashMap<>();
        result.put("user",user);
        result.put("movie",movie);
        return result;
    }
}
