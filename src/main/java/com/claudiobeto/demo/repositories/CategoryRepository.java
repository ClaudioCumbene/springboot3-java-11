package com.claudiobeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiobeto.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
