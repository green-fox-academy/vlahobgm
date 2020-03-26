package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  public BassGuitar() {
    super.numberOfStrings = 4;
  }

  @Override
  void sound() {
    System.out.println("Bass Guitar, a " + super.numberOfStrings + "-stringed instrument that" +
        " goes Duum-duum-duum");
  }
}
