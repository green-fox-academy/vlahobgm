package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Drink;
import com.greenfoxacademy.foxclub.models.Food;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutritionServiceImpl implements NutritionService{
  private FoxRepository foxRepository;

  @Autowired
  public NutritionServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @Override
  public List<Food> getAllFood() {
    List<Food> foodlist = new ArrayList<>();
    for (Food food : Food.values()) {
      foodlist.add(food);
    }
    return foodlist;
  }

  @Override
  public List<Drink> getAllDrink() {
    List<Drink> drinkList = new ArrayList<>();
    for (Drink drink : Drink.values()) {
      drinkList.add(drink);
    }
    return drinkList;
  }

  @Override
  public void changeNutrition(String selectedFood, String selectedDrink, String name) {
    Fox fox = foxRepository.getFoxByName(name);
    fox.setDrink(selectedDrink);
    fox.setFood(selectedFood);
    foxRepository.save(fox);
  }

}
