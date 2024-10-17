package com.java.dev1.demo.controller;

import com.java.dev1.demo.entity.User;
import com.java.dev1.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ramazon")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
