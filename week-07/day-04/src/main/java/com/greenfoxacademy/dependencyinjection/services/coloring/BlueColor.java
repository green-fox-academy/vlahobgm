package com.greenfoxacademy.dependencyinjection.services.coloring;

import com.greenfoxacademy.dependencyinjection.services.printer.Printer;

public class BlueColor implements MyColor {

  @Override
  public void printColor(Printer printer) {
    printer.log("It is blue...");
  }
}
