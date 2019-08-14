package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> 
{
	Users findByUsername(String username);
}
