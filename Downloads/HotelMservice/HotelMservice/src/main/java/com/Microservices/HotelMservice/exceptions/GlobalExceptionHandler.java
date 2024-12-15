package com.Microservices.HotelMservice.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> ResourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Message", ex.getMessage());
		map.put("status", HttpStatus.NOT_FOUND);
		map.put("Success", false);
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
}
