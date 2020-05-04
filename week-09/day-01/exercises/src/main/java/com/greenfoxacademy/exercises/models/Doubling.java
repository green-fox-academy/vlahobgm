package com.greenfoxacademy.exercises.models;

public class Doubling {
  private int received;
  private int result;

  public Doubling(int input) {
    this.received = input;
    this.result = this.received *2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
