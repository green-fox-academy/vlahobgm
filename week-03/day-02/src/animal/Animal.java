package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

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
