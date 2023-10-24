package com.Myproject.project.controller;

import com.Myproject.project.Service.Imp.UserService;
import com.Myproject.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/showAll")
    public List<User> showUser(){
        return userService.showUser();
    }

    @PostMapping("/add-user")
    public User add(@RequestBody User user){
        return userService.add(user);
    }





}
