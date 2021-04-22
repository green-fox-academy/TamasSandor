package com.tom.week03.day03;

public class BattleApp {
  public static void main(String[] args) {
    Ship s1 = new Ship();
    Ship s2 = new Ship();

    s1.fillShip();
    s2.fillShip();

    System.out.println(s1);
    System.out.println(s2);

    s1.battle(s2);
    System.out.println("Battle");

    System.out.println(s1);
    System.out.println(s2);
  }
}
