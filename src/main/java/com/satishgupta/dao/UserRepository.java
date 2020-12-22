package com.satishgupta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishgupta.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}
