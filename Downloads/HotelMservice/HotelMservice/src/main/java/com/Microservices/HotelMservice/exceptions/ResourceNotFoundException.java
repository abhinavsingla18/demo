package com.Microservices.HotelMservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String Message){
		super(Message);
	}

}
