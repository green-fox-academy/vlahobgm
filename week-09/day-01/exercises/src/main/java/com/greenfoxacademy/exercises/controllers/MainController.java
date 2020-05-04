package com.greenfoxacademy.exercises.controllers;

import com.greenfoxacademy.exercises.models.AppendA;
import com.greenfoxacademy.exercises.models.DoUntil;
import com.greenfoxacademy.exercises.models.Doubling;
import com.greenfoxacademy.exercises.models.Error;
import com.greenfoxacademy.exercises.models.Greeter;
import com.greenfoxacademy.exercises.models.Until;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


  @GetMapping("/")
  public String mainPage() {
    return "index";
  }

  @ResponseBody
  @GetMapping("/doubling")
  public ResponseEntity<?> getDoubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new Error("Please provide an input!"));
    }
    return ResponseEntity.ok(new Doubling(input));
  }

  @ResponseBody
  @GetMapping("/greeter")
  public ResponseEntity<?> getGreeting(@RequestParam(required = false) String name,
                                      @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return new ResponseEntity<>(new Error("Please provide a name and a title!"),
          HttpStatus.BAD_REQUEST);
    } else if (name == null) {
      return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.BAD_REQUEST);
    } else if (title == null) {
      return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.BAD_REQUEST);
    }
    return ResponseEntity.ok(new Greeter(name, title));
  }

  @ResponseBody
  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> getAppendA(@PathVariable(required = false) String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return ResponseEntity.ok(new AppendA(appendable));
  }

  @ResponseBody
  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable(required = false) String action,
                                   @RequestBody Until until) {
    if (until == null) {
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.BAD_REQUEST);
    }
    return ResponseEntity.ok().body(doUntil(action, until));
  }
}
