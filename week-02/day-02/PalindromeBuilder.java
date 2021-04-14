package com.tom.week02.day02;

public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome("greenfox"));
  }

  private static String createPalindrome(String str) {
    char[] ch = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(str.length() - 1 - i);
    }
    return str.concat(String.valueOf(ch));
  }
}
