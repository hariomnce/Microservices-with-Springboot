package com.microservices.hotelservice.dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.hotelservice.entity.Hotel;

@EnableAutoConfiguration
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
