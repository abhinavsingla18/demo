package com.springboot.LearnBoot.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.LearnBoot.Entity.BOOK;
import com.springboot.LearnBoot.Repository.BookRepo;


@Service
public class BookService {
	@Autowired
	BookRepo BR;
	
	public BOOK GetBookById(int id) {
		
		return (BOOK)BR.findById(id).orElseThrow();
	}
	
	public BOOK SaveBook(BOOK book) {
		return BR.save(book);
	}
	
	public void DeleteBookbyID(int id) {
		 BR.deleteById(id);
	}
	public BOOK updateBook(BOOK book) {
		return BR.save(book);
		
	}
}
