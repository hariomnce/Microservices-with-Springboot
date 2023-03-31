package com.microservices.ratingservice.service;

import java.util.List;

import com.microservices.ratingservice.entity.Rating;

public interface RatingService {

	// Create
	Rating create(Rating rating);

	// Get all ratings
	List<Rating> getRatings();

	// Get all by UserId
	List<Rating> getRatingByUserId(String userId);

	// Get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);

}
