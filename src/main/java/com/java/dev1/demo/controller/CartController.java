package com.java.dev1.demo.controller;


import com.java.dev1.demo.entity.Cart;
import com.java.dev1.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ramazon")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<Cart> saveCart(@RequestBody Cart cart){

        return ResponseEntity.status(HttpStatus.OK).body(new Cart());
    }

    @GetMapping("/cart")
    public ResponseEntity<List<Cart>> getCart(){

        return  ResponseEntity.ok().body(List.of());
    }

    @PutMapping("/cart/{cartID}")
    public ResponseEntity<Cart> updateCart(@PathVariable String userName,@RequestBody Cart cartRequest){

        return  ResponseEntity.status(201).body(new Cart());
    }

    @DeleteMapping("/cart/{cartID}")
    public ResponseEntity deleteCart(@PathVariable String addressID){
//        userService.deleteAddress(addressID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
