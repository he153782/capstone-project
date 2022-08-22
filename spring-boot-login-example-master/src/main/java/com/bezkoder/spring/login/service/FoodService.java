package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import com.bezkoder.spring.login.models.Food;

public interface FoodService {

	List<Food> getAll();

	Food getById(Long id);
    
	Food add(Food foods);
	
	Food update(Food foods);
    
    void delete(Long id) throws IOException;
}
