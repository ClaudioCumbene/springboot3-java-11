package com.claudiobeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiobeto.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
