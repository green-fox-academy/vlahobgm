package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Drink;
import com.greenfoxacademy.foxclub.models.Food;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.NutritionService;
import com.greenfoxacademy.foxclub.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxService foxService;
  private NutritionService nutritionService;
  private TrickService trickService;

  @Autowired
  public MainController(FoxService foxService, NutritionService nutritionService, TrickService trickService) {
    this.foxService = foxService;
    this.nutritionService = nutritionService;
    this.trickService = trickService;
  }

  @GetMapping("/")
  public String getIndex(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionStore")
  public String getNutritionStore(@RequestParam String name, Model model) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    model.addAttribute("foodList", nutritionService.getAllFood());
    model.addAttribute("drinkList", nutritionService.getAllDrink());
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String postNutritionStore(@RequestParam String name, String selectedFood,
                                   String selectedDrink) {
    nutritionService.changeNutrition(selectedFood,selectedDrink,name);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/trickCenter")
  public String getTrickCenter(@RequestParam String name, Model model) {
    model.addAttribute("fox", foxService.getFoxByName(name));
    model.addAttribute("tricks", trickService.returnAllTricks());
    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String postTrickCenter(@RequestParam String name, String selectedTrick) {
    trickService.addTrickToFox(selectedTrick, name);
    return "redirect:/?name=" + name;
  }
}
