package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebShopController {
  List<ShopItem> shopItemList = Arrays.asList(
      new ShopItem("Running shoes", "Clothes and Shoes","Nike running shoes for every day sport",
          1000, 5),
      new ShopItem("Printer", "Electronics", "Some HP printer that will print pages", 3000, 2),
      new ShopItem("Coca Cola", "Beverages and Snacks", "0.5l standard coke", 25, 0),
      new ShopItem("Wokin", "Beverages and Snacks", "Chicken with fried rice and WOKIN sauce", 119, 100),
      new ShopItem("T-shirt", "Clothes and Shoes", "Blue with a corgi on bike", 300, 1)
  );

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String greeting(Model model) {
    model.addAttribute("items", shopItemList);
    return "index";
  }

  @RequestMapping(value = "/only-available", method = RequestMethod.GET)
  public String onlyAvailable(Model model) {
    model.addAttribute("items", shopItemList.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/cheapest-first", method = RequestMethod.GET)
  public String cheapestFirst(Model model) {
    model.addAttribute("items", shopItemList.stream()
        .sorted(Comparator.comparingLong(ShopItem::getPrice))
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/contains-nike", method = RequestMethod.GET)
  public String containsNike(Model model) {
    model.addAttribute("items", shopItemList.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike") || item.getDescription().toLowerCase().contains(
            "nike"))
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping(value = "/average-stock", method = RequestMethod.GET)
  public String averageStock(Model model) {
    model.addAttribute("items", shopItemList.stream()
        .mapToDouble(item -> item.getQuantityOfStock())
        .average()
        .getAsDouble());
    return "averagestock";
  }

  @RequestMapping(value = "/most-expensive", method = RequestMethod.GET)
  public String mostExpensive(Model model) {
    model.addAttribute("items", shopItemList.stream()
        .max(Comparator.comparing(ShopItem::getPrice))
        .orElseThrow(NoSuchElementException::new));
    return "index";
  }

  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public String search(Model model, String search) {
    model.addAttribute("items", shopItemList.stream()
        .filter(item -> item.getName().toLowerCase().contains(search.toLowerCase()) ||
            item.getDescription().toLowerCase().contains(search.toLowerCase()))
        .collect(Collectors.toList()));
    return "index";
  }

}
