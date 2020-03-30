package aircraftCarrier;

public class Main {
  public static void main(String[] args) {
    F16 repcsi16 = new F16();
    System.out.println(repcsi16.getType());
    System.out.println(repcsi16.getStatus());
    System.out.println(repcsi16.refill(3));
    System.out.println(repcsi16.getStatus());
  }
}
