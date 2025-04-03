package com.example.day_01.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	@GetMapping("/user/{id}")
	public UserResponse getUserById(@PathVariable("id") int userId) {

		if (userId == 0) {
			throw new UserNotFoundException(String.valueOf(userId));
		}

		UserResponse userResponse = new UserResponse();
		userResponse.setId(userId);
		userResponse.setFirst_Name("John");
		userResponse.setAge(30);

		return userResponse;

	}

}