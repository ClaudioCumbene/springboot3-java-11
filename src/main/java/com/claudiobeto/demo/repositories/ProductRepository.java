package com.claudiobeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiobeto.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
