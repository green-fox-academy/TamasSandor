package com.tom.week03.day05;

public class Bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    System.out.println(floppyEars(5));
  }

  private static int floppyEars(int n) {
    if (n == 1) {
      return 2;
    }
    return 2 + floppyEars(n - 1);
  }
}
