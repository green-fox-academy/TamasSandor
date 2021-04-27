package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super("Duum-duum-duum", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Duum-duum-duum", numberOfStrings);
  }

  @Override
  protected void play() {
    System.out
        .println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
