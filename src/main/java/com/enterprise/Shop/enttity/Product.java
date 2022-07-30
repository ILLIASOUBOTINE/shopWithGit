package com.enterprise.Shop.enttity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "code_product")
    private int codeProduct;

    @Column(columnDefinition = "text")
    private String description;


}
