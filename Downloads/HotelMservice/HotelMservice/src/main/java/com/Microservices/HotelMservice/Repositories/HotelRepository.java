package com.Microservices.HotelMservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.HotelMservice.entities.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
