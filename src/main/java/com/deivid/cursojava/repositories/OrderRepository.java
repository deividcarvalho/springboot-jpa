package com.deivid.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivid.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
