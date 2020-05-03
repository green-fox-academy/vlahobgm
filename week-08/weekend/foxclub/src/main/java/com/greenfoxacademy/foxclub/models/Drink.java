package com.greenfoxacademy.foxclub.models;

public enum Drink {
  BEER("beer"),
  VODKA("vodka"),
  GIN("gin"),
  WATER("water"),
  ORANGEJUICE("orange juice"),
  ONIONJUICE("onion juice");

  public final String label;

  private Drink(String label) {
    this.label = label;
  }
}
