package com.greenfoxacademy.dependencyinjection.services.coloring;

import com.greenfoxacademy.dependencyinjection.services.printer.Printer;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {

  @Override
  public void printColor(Printer printer) {
    System.out.println("It is red color...");
  }
}
