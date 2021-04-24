package com.tom.week03.day05;

public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and
    // adds numbers from 1 to n.
    System.out.println(adder(3));
  }

  public static int adder(int n) {
    if (n == 1) {
      return 1;
    }
    return n + adder(n - 1);
  }
}
