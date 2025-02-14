package com.springboot.LearnBoot.Exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class mycontrolleradvice extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> elementnotfound(NoSuchElementException e){
		return new ResponseEntity<Object>("No Value present in DB", HttpStatus.NOT_FOUND);
		
	}
	@Override
		public ResponseEntity<Object> handleHttpRequestMethodNotSupported(
				HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request){
		return new ResponseEntity<Object>("Method not supported", HttpStatus.METHOD_NOT_ALLOWED);
	}
}
