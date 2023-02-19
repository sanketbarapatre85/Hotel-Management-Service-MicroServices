package com.seleniumexpress.rateingservice.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seleniumexpress.rateingservice.entities.Rateing;

public interface RateingRepositery extends JpaRepository<Rateing, String> {
	
	//Custom finder method
	List<Rateing> findByUserId(String userId);
	List<Rateing> findByHotelId(String hotelId);
	//
	
}
