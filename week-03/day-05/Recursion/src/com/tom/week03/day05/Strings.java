package com.tom.week03.day05;

public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeXtoY("XxXxXx"));
  }

  private static String changeXtoY(String str) {
    if (str.length() == 0) {
      return "";
    }
    char firstLetter = str.charAt(0);
    if (firstLetter == 'x') {
      firstLetter = 'y';
    }
    return firstLetter + changeXtoY(str.substring(1));
  }
}
