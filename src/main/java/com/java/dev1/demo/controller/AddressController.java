package com.java.dev1.demo.controller;

import com.java.dev1.demo.entity.User;
import com.java.dev1.demo.service.AddressService;
import com.java.dev1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ramazon")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public ResponseEntity<User> saveUser(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.OK).body(new User());
    }

    @GetMapping("/address")
    public ResponseEntity<List<User>> getAddress(){

        return  ResponseEntity.ok().body(List.of());
    }

    @PutMapping("/address/{addressID}")
    public ResponseEntity<User> updateAddress(@PathVariable String userName,@RequestBody User userRequest){

        return  ResponseEntity.status(201).body(new User());
    }

    @DeleteMapping("/address/{addressID}")
    public ResponseEntity deleteAddress(@PathVariable String addressID){
//        userService.deleteAddress(addressID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
