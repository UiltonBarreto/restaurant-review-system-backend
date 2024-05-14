package com.restaurantreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantreview.dto.RestaurantResponse;
import com.restaurantreview.entity.Restaurant;
import com.restaurantreview.service.RestaurantService;

@RestController
@RequestMapping("api/restaurant")
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@PostMapping("add")
	public ResponseEntity<RestaurantResponse> addRestaurant(@RequestBody Restaurant restaurant) {
		return this.restaurantService.addRestaurant(restaurant);
	}
	
	@GetMapping("fetch/all")
	public ResponseEntity<RestaurantResponse> viewRestaurants() {
		return this.restaurantService.viewRestaurants();
	}
	
	@GetMapping("fetch/id")
	public ResponseEntity<RestaurantResponse> fetchRestaurantByID(@RequestParam("restaurantId") int restaurantId) {
		return this.restaurantService.fetchRestaurantByID(restaurantId);
	}
	
	@GetMapping("fetch/location-wise")
	public ResponseEntity<RestaurantResponse> fetchRestaurantByLocation(@RequestParam("location") String location) {
		return this.restaurantService.fetchRestaurantByLocation(location);
	}

}
