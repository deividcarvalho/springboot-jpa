package com.deivid.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivid.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
