package com.claudiobeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiobeto.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
