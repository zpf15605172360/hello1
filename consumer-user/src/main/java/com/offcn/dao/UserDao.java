package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author Zpf
 * @create 2020-10-21 12:31
 */
@Repository
public class UserDao {
    public User getUser(Integer id){
        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        return  user;
    }
}
