package com.tom.week02.day02;

public class Summing {
  public static void main(String[] args) {
    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
  }

  private static int sum(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return sum;
  }
}
