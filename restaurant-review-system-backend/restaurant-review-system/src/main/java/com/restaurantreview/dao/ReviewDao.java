package com.restaurantreview.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantreview.entity.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {

	List<Review> findByRestaurantId(int restaurantId);

}
