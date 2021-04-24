package com.tom.week03.day02;

public class DivideByZero {

  public static void main(String[] args) {
    // Create a function that divides number 10
    // by a number that's passed as a parameter and prints the result.
    // It should print "fail" if the parameter is 0

    divide(0);
  }

  public static void divide(int num) {
    try {
      System.out.println(10 / num);
    } catch (ArithmeticException e) {
      System.err.println("fail");
    }
  }
}
