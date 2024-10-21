package com.java.dev1.demo.service;


import com.java.dev1.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User updateUser(String userName,User userRequest);

    void deleteUser(String userName);
}
