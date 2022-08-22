package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.login.models.Food;
import com.bezkoder.spring.login.repository.FoodResponse;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodResponse foodResponse;

	@Override
	public List<Food> getAll() {

		return foodResponse.findAll();
	}

	@Override
	public Food getById(Long id) {

		return foodResponse.findById(id).orElse(null);
	}

	@Override
	public Food add(Food foods) {

		return foodResponse.save(foods);
	}

	@Override
	public Food update(Food foods) {
		Food exitFood = foodResponse.findById(foods.getId()).orElse(null);
		exitFood.setName(foods.getName());
		exitFood.setType(foods.getType());
		exitFood.setDescription(foods.getDescription());
		exitFood.setCalories(foods.getCalories());
		exitFood.setQuantity(foods.getQuantity());
		exitFood.setPrice(foods.getPrice());
		
		return foodResponse.save(foods);
	}

	@Override
	public void delete(Long id) throws IOException {
		foodResponse.deleteById(id);
	}

}
