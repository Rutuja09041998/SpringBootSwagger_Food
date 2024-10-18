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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("food")
public class Rest {
	
	@Autowired
	private FoodService foodService;
	
	@Operation(
			responses = {
					@ApiResponse(
					description = "Created",
					responseCode = "201"
					),
					 @ApiResponse(
								description = "Bad Request",
								responseCode = "400"
								),
					 @ApiResponse(
								description = "Internal Server Error",
								responseCode = "500"
								),
			}
			)
	@PostMapping("save")
	public Food saveFood(@RequestBody Food food) {
		return foodService.save(food);
	}
	
	@Operation(
			responses = { @ApiResponse(
					description = "Ok",
					responseCode = "200"
					),
					 @ApiResponse(
								description = "Bad Request",
								responseCode = "400"
								),
					 @ApiResponse(
								description = "Internal Server Error",
								responseCode = "500"
								),
			}
			)
	@GetMapping("all")
	public List<Food> getAll(){
		return foodService.getAllFood();
	}
	
	@Operation(
			responses = { @ApiResponse(
					description = "Ok",
					responseCode = "200"
					),
					 @ApiResponse(
								description = "Bad Request",
								responseCode = "400"
								),
					 @ApiResponse(
								description = "Internal Server Error",
								responseCode = "500"
								),
			}
			)
	@GetMapping("findById/{id}")
	public Food getById(@PathVariable int id){
		return foodService.getByFoodId(id);
	}
	
	@Operation(
			responses = { @ApiResponse(
					description = "Ok",
					responseCode = "200"
					),
					 @ApiResponse(
								description = "Bad Request",
								responseCode = "400"
								),
					 @ApiResponse(
								description = "Internal Server Error",
								responseCode = "500"
								),
			}
	)
	@PutMapping("updateById/{id}")
	public Food updateById( @RequestBody Food food ,@PathVariable int id) {
		return foodService.updateByFoodId(food,id);
	}
	
	@Operation(
			responses = { @ApiResponse(
					description = "Ok",
					responseCode = "200"
					),
					 @ApiResponse(
								description = "Bad Request",
								responseCode = "400"
								),
					 @ApiResponse(
								description = "Internal Server Error",
								responseCode = "500"
								),
			}
			)
	@DeleteMapping("deleteById/{id}")
	public Food deleteById( @PathVariable int id) {
		return foodService.deleteByFoodId(id);
	}
}
