package com.Microservices.HotelMservice.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Microservices.HotelMservice.entities.Hotel;
import com.Microservices.HotelMservice.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@PostMapping("/addhotel")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		ResponseEntity<Hotel> response = ResponseEntity.status(HttpStatus.CREATED).body(hotelService.save(hotel));
		return response;
	}
	//get user by Id 
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.gethotel(id));
	}
	// get all users
	@GetMapping("/getallhotels")
	public ResponseEntity<List<Hotel>> getAllhotels(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
	}
	//Updating a user
	@PutMapping("/update/{id}")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel, @PathVariable int id){
		return ResponseEntity.status(200).body(hotelService.updatehotel(hotel, id));
	}
	//Deleting a User
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteHotelbyId(@PathVariable int id){
		hotelService.deletehotel(id);
		return ResponseEntity.status(200).body("User Deleted");
	}
}
