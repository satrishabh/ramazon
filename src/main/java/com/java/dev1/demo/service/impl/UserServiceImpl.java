package com.java.dev1.demo.service.impl;

import com.java.dev1.demo.entity.User;
import com.java.dev1.demo.repository.UserRepository;
import com.java.dev1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String userName, User userRequest) {
        User user= userRepository.getByUserName(userName);
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setPassword(userRequest.getPassword());

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String userName) {
        User user= userRepository.getByUserName(userName);
        userRepository.delete(user);
    }
}
