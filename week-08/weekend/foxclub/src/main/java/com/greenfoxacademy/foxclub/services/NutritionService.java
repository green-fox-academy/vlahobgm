package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Drink;
import com.greenfoxacademy.foxclub.models.Food;
import com.greenfoxacademy.foxclub.models.Fox;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface NutritionService {
  List<Food> getAllFood();
  List<Drink> getAllDrink();
  void changeNutrition(String selectedFood, String selectedDrink, String name);
}
