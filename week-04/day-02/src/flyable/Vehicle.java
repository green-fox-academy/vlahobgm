package flyable;

public abstract class Vehicle {
  protected String name;
  protected int numberOfWheels;
  protected String color;

  public Vehicle() {
  }

  public Vehicle(String name, int numberOfWheels, String color) {
    this.name = name;
    this.numberOfWheels = numberOfWheels;
    this.color = color;
  }
}
