package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = "/")
  public String mainPage(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("selectedFox", foxService.getFoxByName(name));
    return "index";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String loginForm() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(@RequestParam String name, Model model) {
    model.addAttribute("foxName", name);
    return "redirect:/?name=" + name;
  }

  @RequestMapping(value = "/nutritionStore", method = RequestMethod.GET)
  public String nutritionView () {
    return "nutritionstore";
  }

  @RequestMapping(value = "/trickCenter", method = RequestMethod.GET)
  public String trickCenterView () {
    return "trickcenter";
  }

  @RequestMapping(value = "/actionHistory", method = RequestMethod.GET)
  public String actionHistoryView () {
    return "actionhistory";
  }
}
