package flyable;

public class Helicopter extends Vehicle implements Flyable{
  @Override
  public void land() {
    System.out.println("landed");
  }

  @Override
  public void fly() {
    System.out.println("flying");
  }

  @Override
  public void takeOff() {
    System.out.println("takeoff");
  }
}
