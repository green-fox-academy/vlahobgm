package com.greenfoxacademy.resttest.controllers;

import com.greenfoxacademy.resttest.models.Error;
import com.greenfoxacademy.resttest.models.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity translateToGroot(@RequestParam(required = false) String message) {
    if (message == null || message.isEmpty()) {
      return ResponseEntity.badRequest().body(new Error("I am Groot!"));
    }
    return ResponseEntity.ok(new Groot(message));
  }
}
