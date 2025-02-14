package com.springboot.LearnBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.LearnBoot.DTO.UserLocationDTO;
import com.springboot.LearnBoot.Service.UserService;

@RestController
@RequestMapping("/Users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUserlocations")
	public ResponseEntity<List<UserLocationDTO>> getAlluserLocations(){
		return ResponseEntity.ok().body(userService.getAllUserslocation());
	}
}
