package com.greenfoxacademy.exercises.models;

public class DoUntil {
  private Integer result;

  public DoUntil(String action, Integer number) {
    Integer current = 1;
    if (action == "sum") {
      while (current < number) {
        this.result += current;
        current++;
      }
    }else if (action == "factor") {
      while (current < number) {
        this.result *= current;
        current++;
      }
    }
  }

  public double getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

}
