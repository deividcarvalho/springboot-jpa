package com.deivid.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivid.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
