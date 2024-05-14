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

import com.restaurantreview.dto.CommonApiResponse;
import com.restaurantreview.dto.ReviewResponse;
import com.restaurantreview.entity.Review;
import com.restaurantreview.service.ReviewService;

@RestController
@RequestMapping("api/restaurant/review")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@PostMapping("add")
	public ResponseEntity<CommonApiResponse> addRestaurantReview(@RequestBody Review review) {
		return this.reviewService.addRestaurantReview(review);
	}

	@GetMapping("fetch")
	public ResponseEntity<ReviewResponse> fetchRestautantReviews(@RequestParam("restaurantId") int restaurantId) {
		return this.reviewService.fetchRestautantReviews(restaurantId);
	}

}
