package com.springboot.LearnBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LearnBoot.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
