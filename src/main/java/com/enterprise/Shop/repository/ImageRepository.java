package com.enterprise.Shop.repository;

import com.enterprise.Shop.enttity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image,Integer> {


    Optional<Image> findById(Integer integer);
}
