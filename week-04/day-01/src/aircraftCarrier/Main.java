package aircraftCarrier;

public class Main {
  public static void main(String[] args) throws Exception {
    Aircrafts repcsi16 = new F16();
    Aircrafts repcsi35 = new F35();
    /*System.out.println(repcsi16.getType());
    System.out.println(repcsi16.getStatus());
    System.out.println(repcsi16.refill(3));
    System.out.println(repcsi16.getStatus());
    System.out.println(repcsi16.isPriority());
    System.out.println(repcsi35.isPriority());*/

    Carrier carr = new Carrier(13,500);

    carr.add(repcsi16);
    carr.add(repcsi35);
    carr.fill();
    System.out.println(carr.aircraftsList.get(0).getStatus());
    System.out.println(carr.aircraftsList.get(1).getStatus());
    System.out.println(carr.initialAmmo);
  }
}
