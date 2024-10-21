package com.java.dev1.demo.controller;

import com.java.dev1.demo.entity.User;
import com.java.dev1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ramazon")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){

        return  ResponseEntity.ok().body(userService.getAllUsers());
    }

    @PutMapping("/user/{userName}")
    public ResponseEntity<User> updateUser(@PathVariable String userName,@RequestBody User userRequest){

        return  ResponseEntity.status(201).body(userService.updateUser(userName,userRequest));
    }

    @DeleteMapping("/user/{userName}")
    public ResponseEntity deleteUser(@PathVariable String userName){
        userService.deleteUser(userName);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
