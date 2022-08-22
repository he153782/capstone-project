package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.login.models.Exercise;
import com.bezkoder.spring.login.repository.ExecriseResponse;

@Service
@Transactional
public class ExerciseImpl implements ExerciseService{
	
	@Autowired
	private ExecriseResponse exerciseResponse;

	@Override
	public List<Exercise> getAll() {
		return exerciseResponse.findAll();
	}

	@Override
	public Exercise getById(Long id) {
		return exerciseResponse.findById(id).orElse(null);
	}

	@Override
	public Exercise add(Exercise exercise) {
		return exerciseResponse.save(exercise);
	}

	@Override
	public Exercise update(Exercise exercise) {
		Exercise exitExercise = exerciseResponse.findById(exercise.getId()).orElse(null);
		exitExercise.setName(exercise.getName());
		exitExercise.setType(exercise.getType());
		exitExercise.setLevel(exercise.getLevel());
		exitExercise.setDescription(exercise.getDescription());
		exitExercise.setUrlVideo(exercise.getUrlVideo());
		return exerciseResponse.save(exitExercise);
	}

	@Override
	public void delete(Long id) throws IOException {
	 exerciseResponse.deleteById(id);
	}

}
