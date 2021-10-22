package com.example.demo.model.response;

import java.util.List;

import com.example.demo.entity.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private List<User> users;
    private User user;
}
