package main.java.music;

abstract class StringedInstrument extends Instrument{
  protected int numberOfStrings;

  abstract void sound();

  @Override
  public void play() {
    sound();
  }
}
