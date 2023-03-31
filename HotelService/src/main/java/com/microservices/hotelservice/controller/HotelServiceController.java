package com.microservices.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.hotelservice.entity.Hotel;
import com.microservices.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelServiceController {

	@Autowired
	HotelService hotelService;

	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Hotel>> getAll() {
		return ResponseEntity.ok(hotelService.getAll());
	}

}
