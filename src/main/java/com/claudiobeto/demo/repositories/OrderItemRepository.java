package com.claudiobeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiobeto.demo.entities.OrderItem;
import com.claudiobeto.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
