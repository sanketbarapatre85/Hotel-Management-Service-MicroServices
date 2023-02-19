package com.seleniumexpress.rateingservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RATEING")
public class Rateing {
	
	@Id
	private String rateingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedBack;
	
	
	
	public Rateing(String rateingId, String userId, String hotelId, int rating, String feedBack) {
		super();
		this.rateingId = rateingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedBack = feedBack;
	}
	
	public Rateing() {
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	public String getRateingId() {
		return rateingId;
	}
	public void setRateingId(String rateingId) {
		this.rateingId = rateingId;
	}
}
