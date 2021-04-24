package com.tom.week03.day05;

public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
    System.out.println(sumDigits(123));
  }

  private static int sumDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10 + sumDigits(n / 10));
  }
}
