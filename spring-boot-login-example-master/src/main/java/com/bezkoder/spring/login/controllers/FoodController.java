package com.bezkoder.spring.login.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.login.models.Food;
import com.bezkoder.spring.login.service.FoodService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/food")
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Food>> getAll() {
		List<Food> foods = foodService.getAll();
//		return new ResponseEntity<>(foods,HttpStatus.OK);
		return ResponseEntity.ok().body(foods);
	}
	
	@GetMapping("/list-{id}")
	public ResponseEntity<Food> getFoodById(@PathVariable Long id) {
		Food exercises = foodService.getById(id);
		return new ResponseEntity<>(exercises,HttpStatus.OK);
	}
	
	@PostMapping("/update-food")
	public ResponseEntity<Food> updateExcirse(@RequestBody Food food) {
		Food foods = foodService.update(food);
		return new ResponseEntity<>(foods,HttpStatus.OK);
	}
	
	@PostMapping("/add-food")
	public ResponseEntity<Food> add(@RequestBody Food food) {
		Food foods = foodService.add(food);
		return new ResponseEntity<>(foods,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable Long id) throws IOException {
		foodService.delete(id);
		return "delete Food Id: " + id;
	}
}
