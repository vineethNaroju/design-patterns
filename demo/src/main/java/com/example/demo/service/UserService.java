package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findById(long id) {
        return repository.findById(id).stream().collect(Collectors.toList());
    }

    public List<User> findAllSortedByAge() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "age"));
    }

    public List<User> findAllByName(String name) {
        return repository.findByName(name);
    }

    public User createUser(String name, int age) {
        return repository.save(new User(name, age));
    }
}
