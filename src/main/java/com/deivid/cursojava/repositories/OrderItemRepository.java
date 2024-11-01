package com.deivid.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivid.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
