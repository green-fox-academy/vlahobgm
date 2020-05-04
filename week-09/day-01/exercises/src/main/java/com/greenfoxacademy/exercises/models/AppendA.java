package com.greenfoxacademy.exercises.models;

public class AppendA {
  private String appended;
  private String appendable;

  public AppendA(String appendable) {
    this.appendable = appendable;
    this.appended = this.appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }
}
