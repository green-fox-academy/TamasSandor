package com.tom.week03.day05;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // Find the greatest common divisor of two numbers using recursion.
    System.out.println(greatestCommonDivisor(666, 999));
  }

  private static int greatestCommonDivisor(int a, int b) {
    return b == 0 ? a : greatestCommonDivisor(b, a % b);
  }
}
