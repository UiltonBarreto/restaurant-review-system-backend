package com.restaurantreview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurantreview.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);

	User findByEmailIdAndRole(String emailId, String role);

}
