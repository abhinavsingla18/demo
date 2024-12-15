package com.springboot.LearnBoot.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.LearnBoot.DTO.UserLocationDTO;
import com.springboot.LearnBoot.Entity.User;
import com.springboot.LearnBoot.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<UserLocationDTO> getAllUserslocation(){
		return userRepository.findAll()
				.stream().map(u->convertEntitytoDTO(u)).collect(Collectors.toList());
		
	}
	public UserLocationDTO convertEntitytoDTO(User user) {
		UserLocationDTO uld = new UserLocationDTO();
		uld.setId(user.getId());
		uld.setName(user.getName());
		uld.setEmail(user.getEmail());
		uld.setDistance(user.getLocation().getDistance());
		uld.setPlace(user.getLocation().getPlace_name());
		return uld;
		
	}
	
}
