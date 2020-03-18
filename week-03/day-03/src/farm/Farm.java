package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  /*it has list of Animals
  it has slots which defines the number of free places for animals
  breed() -> creates a new animal if there's place for it
  slaughter() -> removes the least hungry animal*/
  List<Animal> farm;
  int freeSpaces;
  int maxSpace = 5;
  
  public Farm(){
    farm = new ArrayList<>();
    freeSpaces = maxSpace - farm.size();
  }

  public void breed(){
      if (freeSpaces > 0) {
        farm.add(new Animal());
      }
  }

  public void slaughter(){


  }

}
