package com.tom.week03.day03;

public class WarApp {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      Armada a1 = new Armada();
      Armada a2 = new Armada();

      boolean winner = a1.war(a2);
      if (winner) {
        System.out.println("First wins");
      } else {
        System.out.println("Second wins");
      }
    }
  }
}
