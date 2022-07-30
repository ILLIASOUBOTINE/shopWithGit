package com.enterprise.Shop.enttity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "code_photo")
    private int codePhoto;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
    @Column(name = "product_id")
    private int productId;
}
