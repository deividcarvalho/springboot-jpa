package com.deivid.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivid.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
