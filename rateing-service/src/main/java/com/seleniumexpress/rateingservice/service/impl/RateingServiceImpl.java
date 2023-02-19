package com.seleniumexpress.rateingservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.rateingservice.entities.Rateing;
import com.seleniumexpress.rateingservice.repositery.RateingRepositery;
import com.seleniumexpress.rateingservice.service.RateingService;

@Service
public class RateingServiceImpl implements RateingService {

	@Autowired
	private RateingRepositery rateingRepositery;
	
	
	@Override
	public Rateing create(Rateing rateing) {
		return rateingRepositery.save(rateing);
	}

	@Override
	public List<Rateing> getAllRateing() {
		return rateingRepositery.findAll();
	}

	@Override
	public List<Rateing> getRateingByHotel(String hotelId) {
		return rateingRepositery.findByHotelId(hotelId);
	}

	@Override
	public List<Rateing> getRateingByUser(String userId) {
		return rateingRepositery.findByUserId(userId);
	}

}
