package farm;

public class Animal {
  int hunger = 50;
  int thirst = 50;
  String name;

  public Animal(String name){
    this.name = name;
  }

  public void eat(){
    this.hunger -= 1;
  }
  public void drink(){
    this.thirst -= 1;
  }

  public void play(){
    this.thirst += 1;
    this.hunger += 1;
  }
}