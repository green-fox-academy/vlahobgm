package theGardenApplication;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden("KERT");

    Flower yellowFlower = new Flower("yellow",5);
    garden.addFlower(yellowFlower);
    Flower blueFlower = new Flower("Blue",10);
    garden.addFlower(blueFlower);
    Tree purpleTree = new Tree("purple",20);
    garden.addTree(purpleTree);
    Tree orangeTree = new Tree("orange", 0);
    garden.addTree(orangeTree);


  }
}
