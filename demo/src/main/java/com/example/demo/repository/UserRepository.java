package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.User;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    @Query(value = "SELECT u FROM User u")
    List<User> findAllUsers(Sort sort);
}
