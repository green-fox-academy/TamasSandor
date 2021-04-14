package com.tom.datastructures;

public class Reverse {
  public static void main(String[] args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done

    System.out.println(reverse(toBeReversed));
    System.out.println(reverse2(toBeReversed));
  }

  private static String reverse(String str) {
    String reversedStr = "";
    for (int i = 0; i < str.length(); i++) {
      reversedStr += str.charAt(str.length() - 1 - i);
    }
    return reversedStr;
  }

  private static String reverse2(String str) {
    StringBuilder reversedStr = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      reversedStr.append(str, str.length() - 1 - i, str.length() - i);
    }
    return reversedStr.toString();
  }
}
