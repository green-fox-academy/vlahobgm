package theGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Tree> trees;
  private List<Flower> flowers;
  private String name;

  public Garden(String name){
    this.name = name;
    this.trees = new ArrayList<>();
    this.flowers = new ArrayList<>();
  }

  public void addFlower(Flower flower){
    this.flowers.add(flower);
  }

  public void addTree(Tree tree){
    this.trees.add(tree);
  }

  public void watering(){
    
  }
}
