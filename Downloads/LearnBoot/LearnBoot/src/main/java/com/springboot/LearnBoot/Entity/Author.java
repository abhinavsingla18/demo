package com.springboot.LearnBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @ToString
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AuthorId;
	private String name;
	@OneToOne(mappedBy = "author")
	private BOOK book;
}
