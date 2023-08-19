package com.schantzdouglas.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schantzdouglas.fullstackbackend.exception.UserNotFoundException;
import com.schantzdouglas.fullstackbackend.model.User;
import com.schantzdouglas.fullstackbackend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/users")
	List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	User userFindById(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
	}

}
