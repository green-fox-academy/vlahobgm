package com.greenfoxacademy.foxclub.models;

public enum Food {
  APPLE("apple"),
  CHICKEN("chicken"),
  WALNUT("walnut"),
  ALMOND("almond"),
  ORANGE("orange"),
  ONION("onion"),
  CARROT("carrot");

  public final String label;

  private Food(String label) {
    this.label = label;
  }

}
