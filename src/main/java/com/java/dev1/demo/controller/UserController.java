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

    @PutMapping("/user/{userName}")
    public User updateUser(@PathVariable String userName,@RequestBody User userRequest){

        User user= userRepository.getByUserName(userName);
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setPassword(userRequest.getPassword());

        return userRepository.save(user);
    }

    @DeleteMapping("/user/{userName}")
    public void deleteUser(@PathVariable String userName){
        User user= userRepository.getByUserName(userName);
        userRepository.delete(user);
    }
}
