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

import com.bezkoder.spring.login.models.Exercise;
import com.bezkoder.spring.login.service.ExerciseService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/exercise")
public class ExerciseController {
	@Autowired
	private ExerciseService exerciseService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Exercise>> getAll() {
		List<Exercise> exercises = exerciseService.getAll();
		return new ResponseEntity<>(exercises,HttpStatus.OK);
	}
	
	@GetMapping("/list-{id}")
	public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) {
		Exercise exercises = exerciseService.getById(id);
		return new ResponseEntity<>(exercises,HttpStatus.OK);
	}
	
	@PostMapping("/update-exercise")
	public ResponseEntity<Exercise> updateExcirse(@RequestBody Exercise exercise) {
		Exercise exercises = exerciseService.update(exercise);
		return new ResponseEntity<>(exercises,HttpStatus.OK);
	}
	
	@PostMapping("/add-exercise")
	public ResponseEntity<Exercise> add(@RequestBody Exercise exercise) {
		Exercise exercises = exerciseService.add(exercise);
		return new ResponseEntity<>(exercises,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable Long id) throws IOException {
		exerciseService.delete(id);
		return "delete Exercise Id: " + id;
	}
}
