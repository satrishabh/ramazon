package com.java.dev1.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="city")
    private String city;

    @Column(name="full_address")
    private String fullAddress;

    @Column(name="pin_code")
    private String pinCode;

    @Column(name = "user_id")
    private Integer userID;
}
