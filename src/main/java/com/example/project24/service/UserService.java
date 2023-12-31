package com.example.project24.service;

import com.example.project24.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();

    void deleteUser(int id);

}
