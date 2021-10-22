package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.model.request.UserRequest;
import com.example.demo.model.response.UserResponse;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/user")
public class UserController {
    
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserResponse findAllbyName(@RequestParam(name = "name") String name) {
        List<User> users = service.findAllByName(name);
        return UserResponse.builder().users(users).build();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserResponse findById(@PathVariable("id") long id) {
        List<User> users = service.findById(id);
        return UserResponse.builder().users(users).build();
    }

    @GetMapping(value = "/sorted-by-age")
    @ResponseBody
    public UserResponse finaAllSortedByAge() {
        List<User> users = service.findAllSortedByAge();
        return UserResponse.builder().users(users).build();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserResponse createUser(@RequestBody UserRequest request) {
        User user = service.createUser(request.getName(), request.getAge());
        return UserResponse.builder().user(user).build();
    }
}
