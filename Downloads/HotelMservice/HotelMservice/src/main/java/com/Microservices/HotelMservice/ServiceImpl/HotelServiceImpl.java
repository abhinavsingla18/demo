package com.Microservices.HotelMservice.ServiceImpl;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Microservices.HotelMservice.Repositories.HotelRepository;
import com.Microservices.HotelMservice.entities.Hotel;
import com.Microservices.HotelMservice.exceptions.ResourceNotFoundException;
import com.Microservices.HotelMservice.services.HotelService;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel save(Hotel hotel) {
		Random ran = new Random();
		int UID = ran.nextInt();
		hotel.setHotelId(UID);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel gethotel(int hotelid) {
		return hotelRepository.findById(hotelid).orElseThrow(()-> new ResourceNotFoundException("The hotel with the given Hotel Id is not present"));
	}

	@Override
	public Hotel updatehotel(Hotel hotel, int id) {
		Hotel existinghotel = gethotel(id);
		//existinghotel.setHotelId(id);
		BeanUtils.copyProperties(existinghotel, hotel, "HotelId");
		return hotelRepository.save(existinghotel);
	}

	@Override
	public void deletehotel(int hotelid) {
		hotelRepository.deleteById(hotelid);
		
	}

}
