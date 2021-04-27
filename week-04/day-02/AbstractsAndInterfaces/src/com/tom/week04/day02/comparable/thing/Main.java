package com.tom.week04.day02.comparable.thing;

public class Main {
  public static void main(String[] args) {
    Thing t1 = new Thing("Do homework");
    Thing t2 = new Thing("Play games");

    System.out.println(t1.compareTo(t2));

    t2.complete();
    System.out.println(t1.compareTo(t2));
  }
}
