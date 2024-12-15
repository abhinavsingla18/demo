package com.springboot.LearnBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.LearnBoot.Entity.BOOK;
@Repository
public interface BookRepo extends JpaRepository<BOOK, Integer> {
	//@Query(value = "select * from BOOK", nativeQuery = true)
	//public BOOK findById(int id);
	
}
