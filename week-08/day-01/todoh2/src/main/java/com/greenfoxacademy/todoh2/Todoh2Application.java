package com.greenfoxacademy.todoh2;

import com.greenfoxacademy.todoh2.models.Todo;
import com.greenfoxacademy.todoh2.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application {

  public static void main(String[] args) {
    SpringApplication.run(Todoh2Application.class, args);
  }

}
