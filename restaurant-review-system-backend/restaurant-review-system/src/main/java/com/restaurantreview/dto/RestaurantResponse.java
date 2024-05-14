package com.restaurantreview.dto;

import java.util.ArrayList;
import java.util.List;

import com.restaurantreview.entity.Restaurant;

public class RestaurantResponse extends CommonApiResponse {

	private List<Restaurant> restaurants = new ArrayList<>();

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

}
