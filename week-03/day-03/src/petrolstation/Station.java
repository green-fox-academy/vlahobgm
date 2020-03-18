package petrolstation;

public class Station {
  static int gasAmount = 1000;

  public static void refill(Car car){
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
