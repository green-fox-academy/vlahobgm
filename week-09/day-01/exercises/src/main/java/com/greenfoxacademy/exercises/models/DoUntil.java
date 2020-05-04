package com.greenfoxacademy.exercises.models;

public class DoUntil {
  private Integer result;

  public DoUntil() {
  }

  public DoUntil(String action, Integer result) {
    if (action.equals("factor")) {
      int factor = 1;
      for (int i = 2; i <= result; i++) {
        factor *= i;
      }
      this.result = factor;
    }
    if (action.equals("sum")) {
      int sum = 0;
      for (int i = 0; i <= result; i++) {
        sum += i;
      }
      this.result = sum;
    }
  }

  public double getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

}
