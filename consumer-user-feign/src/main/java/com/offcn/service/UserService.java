package com.offcn.service;

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
    private MovieServiceFeign movieServiceFeign;

    public User getUser(Integer id){
        return userDao.getUser(id);
    }

    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> result=new HashMap<>();
        User user = this.getUser(id);
        result.put("user",user);
        Movie movie = movieServiceFeign.getMovie();
        result.put("movie",movie);
        return result;
    }
}
