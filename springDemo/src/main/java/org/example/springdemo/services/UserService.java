package org.example.springdemo.services;

import org.example.springdemo.models.User;

public interface UserService {
    void register(String username, int age);

    User findByUsername(String user);

}
