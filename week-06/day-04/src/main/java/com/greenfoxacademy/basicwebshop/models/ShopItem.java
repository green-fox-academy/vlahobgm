package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
  private String name;
  private String description;
  private double price;
  private int quantityOfStock;
  private String type;

  public ShopItem(String name, String type, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public String getType() {
    return type;
  }
}
