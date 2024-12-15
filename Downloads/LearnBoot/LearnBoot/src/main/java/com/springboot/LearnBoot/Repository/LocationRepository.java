package com.springboot.LearnBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LearnBoot.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
