package com.restaurantreview.dto;

import java.util.ArrayList;
import java.util.List;

import com.restaurantreview.entity.Review;

public class ReviewResponse extends CommonApiResponse {

	private List<Review> reviews = new ArrayList<>();

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
