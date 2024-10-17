package com.java.dev1.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "user_name", nullable = false, unique = true)
        private String userName;

        @Column(name = "email", nullable = false, unique = true)
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "phone_number")
        private Integer phoneNumber;
}
