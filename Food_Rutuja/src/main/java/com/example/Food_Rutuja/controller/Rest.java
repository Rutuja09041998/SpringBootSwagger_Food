package com.example.Food_Rutuja.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Food_Rutuja.entity.Food;
import com.example.Food_Rutuja.service.FoodService;

@RestController
@RequestMapping("food")
public class Rest {
	
	@Autowired
	private FoodService foodService;
	
	@PostMapping("save")
	public Food saveFood(@RequestBody Food food) {
		return foodService.save(food);
	}
	
	@GetMapping("all")
	public List<Food> getAll(){
		return foodService.getAllFood();
	}
	
	@GetMapping("findById/{id}")
	public Food getById(@PathVariable int id){
		return foodService.getByFoodId(id);
	}
	
	@PutMapping("updateById/{id}")
	public Food updateById( @RequestBody Food food ,@PathVariable int id) {
		return foodService.updateByFoodId(food,id);
	}
	
	@DeleteMapping("deleteById/{id}")
	public Food deleteById( @PathVariable int id) {
		return foodService.deleteByFoodId(id);
	}
}
