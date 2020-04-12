package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class HelloWorldController {

    @Autowired
    private UserService userService;
    @RequestMapping("/set")
    public String setUser(@RequestParam(value="Name") String name, @RequestParam(value="Author") String author) {
       return userService.setUser(name, author);
    }

    @RequestMapping("/get")
    public String getUser(@RequestParam(value = "id") Long id){
        return userService.getUserById(id);
    }
}

