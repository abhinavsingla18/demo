package com.springboot.LearnBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String place_name;
	 private int distance;
	 
}
