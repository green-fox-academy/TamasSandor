package com.tom.week03.day03;

public class Station {
  private int gasAmount;

  public Station() {
    gasAmount = 1000;
  }

  public void refill(Car car) {
    gasAmount -= car.capacity;
    car.gasAmount = car.capacity;
  }
}
