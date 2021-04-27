package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super("Screech", 4);
  }

  @Override
  protected void play() {
    System.out
        .println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
