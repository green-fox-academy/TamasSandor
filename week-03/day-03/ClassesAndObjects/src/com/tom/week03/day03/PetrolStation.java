package com.tom.week03.day03;

public class PetrolStation {
  public static void main(String[] args) {
    Station s = new Station();
    Car c = new Car();
    s.refill(c);

    System.out.println(c.gasAmount);
  }
}
