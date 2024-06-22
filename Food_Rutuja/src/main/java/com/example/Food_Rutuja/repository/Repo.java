package com.example.Food_Rutuja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Food_Rutuja.entity.Food;

@Repository
public interface Repo extends JpaRepository<Food, Integer>{

}
