package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
  private String name;
  private String description;
  private long price;
  private int quantityOfStock;

  public ShopItem(String name, String description, long price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public long getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
