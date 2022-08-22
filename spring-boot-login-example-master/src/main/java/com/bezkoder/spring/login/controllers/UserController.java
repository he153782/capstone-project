package com.bezkoder.spring.login.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.login.models.User;
import com.bezkoder.spring.login.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public ResponseEntity<List<User>>getAll() {
		List<User> users = userService.getAll();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping("/list-{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		User users = userService.getUserById(id);
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PostMapping("/update-user")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User users = userService.Update(user);
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
}
