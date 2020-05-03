package com.greenfoxacademy.foxclub;

import com.greenfoxacademy.foxclub.models.Drink;
import com.greenfoxacademy.foxclub.models.Food;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxclubApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(FoxclubApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
