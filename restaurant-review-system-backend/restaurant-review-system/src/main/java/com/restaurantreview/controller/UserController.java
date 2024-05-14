package com.restaurantreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantreview.dto.AddUserRequest;
import com.restaurantreview.dto.UserLoginRequest;
import com.restaurantreview.dto.UserResponse;
import com.restaurantreview.service.UserService;

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("register")
	public ResponseEntity<UserResponse> registerUser(@RequestBody AddUserRequest userRequest) {
		return this.userService.registerUser(userRequest);
	}

	@PostMapping("login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserLoginRequest loginRequest) {
		return this.userService.loginUser(loginRequest);
	}

}
