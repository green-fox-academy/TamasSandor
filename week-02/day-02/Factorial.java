package com.tom.week02.day02;

public class Factorial {
  public static void main(String[] args) {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

    System.out.println(calculateFactorial(5));
  }

  private static int calculateFactorial(int num) {
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
