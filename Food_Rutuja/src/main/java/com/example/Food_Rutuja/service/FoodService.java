package com.example.Food_Rutuja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food_Rutuja.entity.Food;
import com.example.Food_Rutuja.repository.Repo;

@Service
public class FoodService {

	@Autowired
	private Repo repo;
	
	public Food save(Food food) {
		return repo.save(food);
	}

	public List<Food> getAllFood() {
		return repo.findAll();
	}

	public Food getByFoodId(int id) {
		Optional<Food> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public Food updateByFoodId(Food food, int id) {
		Optional<Food> optional= repo.findById(id);	
		Food dbFood= new Food();
		if(optional.isPresent()) {
			dbFood=optional.get();
			food.setId(dbFood.getId());
			return repo.save(food);
		}
		return null;
	}

	public Food deleteByFoodId(int id) {
		Optional<Food> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}

}
