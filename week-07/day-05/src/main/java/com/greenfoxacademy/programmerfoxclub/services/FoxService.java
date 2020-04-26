package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private List<Fox> foxList;

  public FoxService() {
    foxList = new ArrayList<>();
    foxList.add(new Fox("Karak",new Food("melon"), new Drink("water")));
    foxList.add(new Fox("Vuk",new Food("bread"), new Drink("coke")));
    foxList.add(new Fox("Gizi",new Food("chicken"), new Drink("water")));
  }

  public void addFox(Fox fox) {
    foxList.add(fox);
  }

  public Fox getFoxByName(String name) {
    for (Fox fox: foxList) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }return null;
  }
}
