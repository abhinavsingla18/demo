package com.Microservices.HotelMservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Hotel {
	
	@Id
	private int HotelId;
	@Column(name = "Hotel_name")
	private String Name;
	private String location;
	
	
}
