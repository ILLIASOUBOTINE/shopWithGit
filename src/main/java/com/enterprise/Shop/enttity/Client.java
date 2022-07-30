package com.enterprise.Shop.enttity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(nullable = false)
    private String lastname;

    @Column(unique = true)
    private String email;

    @Column(unique = true, updatable = true)
    private String username;

    @Column(length = 1000)
    private String password;





}

