package com.example.demo.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    String name;
    int age;
}
