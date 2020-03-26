package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar() {
    super.numberOfStrings = 6;
  }

  @Override
  void sound() {
    System.out.println("Electric Guitar, a " + super.numberOfStrings + "-stringed instrument that" +
        " goes Twang");
  }
}
