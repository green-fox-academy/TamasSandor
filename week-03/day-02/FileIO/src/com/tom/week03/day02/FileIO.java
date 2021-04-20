package com.tom.week03.day02;

public class FileIO {

  public static void main(String[] args) {
    // Create a function that divides number 10
    // by a number that's passed as a paramater and prints the result.
    // It should print "fail" if the parameter is 0

    System.out.println(divide(0));
  }

  public static int divide(int num) {
    try {
      return 10 / num;
    } catch (Exception e) {
      System.out.println("fail");
    }
    return 0;
  }
}
