package com.restaurantreview.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantreview.entity.Restaurant;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, Integer> {
	
	List<Restaurant> findByLocation(String location);
	List<Restaurant> findByLocationContainingIgnoreCase(String location);


}
