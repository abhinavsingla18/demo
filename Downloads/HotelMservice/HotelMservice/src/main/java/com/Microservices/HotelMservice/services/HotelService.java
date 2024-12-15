package com.Microservices.HotelMservice.services;

import java.util.List;

import com.Microservices.HotelMservice.entities.Hotel;

public interface HotelService {

Hotel save(Hotel hotel);
	
	List<Hotel> getAllHotels();
	
	Hotel gethotel(int hotelid);
	
	Hotel updatehotel(Hotel hotel, int id);
	
	void deletehotel(int hotelid);
}
