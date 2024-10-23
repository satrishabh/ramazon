package com.java.dev1.demo.controller;


import com.java.dev1.demo.entity.Cart;
import com.java.dev1.demo.entity.Product;
import com.java.dev1.demo.service.CartService;
import com.java.dev1.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ramazon")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Product> saveCart(@RequestBody Product product){

        return ResponseEntity.status(HttpStatus.OK).body(new Product());
    }

    @GetMapping("/cart")
    public ResponseEntity<List<Product>> getProduct(){

        return  ResponseEntity.ok().body(List.of());
    }

    @PutMapping("/cart/{cartID}")
    public ResponseEntity<Product> updateProduct(@PathVariable String userName,@RequestBody Product productRequest){

        return  ResponseEntity.status(201).body(new Product());
    }

    @DeleteMapping("/cart/{cartID}")
    public ResponseEntity deleteCart(@PathVariable String addressID){
//        userService.deleteAddress(addressID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
