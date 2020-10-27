package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Zpf
 * @create 2020-10-21 12:35
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("user")
    public User getUser(@RequestParam("id") Integer id){
        return userService.getUser(id);
    }

    @GetMapping("buyMovie")
    public Map<String,Object> buyMovie(@RequestParam("id") Integer id){
        return userService.buyMovie(id);
    }
}
