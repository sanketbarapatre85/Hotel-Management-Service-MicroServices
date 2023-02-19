package com.seleniumexpress.rateingservice.controllers;

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
import com.seleniumexpress.rateingservice.entities.Rateing;
import com.seleniumexpress.rateingservice.service.RateingService;


@RestController
 @RequestMapping("/ratings")
public class RatingControllers {
	
	@Autowired
	private RateingService rateingService;
	
	
	@PostMapping
	public ResponseEntity<Rateing> create(@RequestBody Rateing rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(rateingService.create(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rateing>> getRateing(){
		return ResponseEntity.ok(rateingService.getAllRateing());
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rateing>> getByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(rateingService.getRateingByHotel(hotelId));
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rateing>> getByUserId(@PathVariable String userId){
		return ResponseEntity.ok(rateingService.getRateingByUser(userId));
	}

}
