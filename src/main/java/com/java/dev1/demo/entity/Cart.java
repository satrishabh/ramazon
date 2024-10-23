package com.java.dev1.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="amount")
    private Integer amount;

    @Column(name="product_id")
    private Integer productID;
}
