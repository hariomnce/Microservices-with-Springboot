package com.microservices.ratingservice.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.ratingservice.entity.Rating;

@EnableAutoConfiguration
public interface RatingRepository extends JpaRepository<Rating, String> {

	// Custom finder methods
	List<Rating> findByUserId(String userId);

	List<Rating> findByHotelId(String hotelId);

}
