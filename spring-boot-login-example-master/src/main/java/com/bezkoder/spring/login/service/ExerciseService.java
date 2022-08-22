package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import com.bezkoder.spring.login.models.Exercise;



public interface ExerciseService {
	List<Exercise> getAll();

	Exercise getById(Long id);
    
	Exercise add(Exercise exercise);
	
	Exercise update(Exercise exercise);
    
    void delete(Long id) throws IOException;
}
