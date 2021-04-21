package com.tom.week03.day03;

public class Counter {
  private int counter;
  private int defaultCounterValue;

  public Counter() {
  }

  public Counter(int counter) {
    this.counter = counter;
    defaultCounterValue = counter;
  }

  public void add(int number) {
    counter += number;
  }

  public void add() {
    counter++;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    counter = defaultCounterValue;
  }
}
