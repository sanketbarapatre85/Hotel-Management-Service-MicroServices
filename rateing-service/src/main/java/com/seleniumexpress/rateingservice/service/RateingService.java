package com.seleniumexpress.rateingservice.service;

import java.util.List;

import com.seleniumexpress.rateingservice.entities.Rateing;

public interface RateingService {
	
	//create
	Rateing create(Rateing rateing);
	
	//get all rateing
	List<Rateing> getAllRateing();
	
	//get by hotel
	List<Rateing> getRateingByHotel(String hotelId);
	
	//get by user
	List<Rateing> getRateingByUser(String userId);

}
