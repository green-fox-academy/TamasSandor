package com.tom.week04.day02.charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.length());
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(1, g.length() - 1));

    ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
    System.out.println(shifter.charAt(0));
  }
}
