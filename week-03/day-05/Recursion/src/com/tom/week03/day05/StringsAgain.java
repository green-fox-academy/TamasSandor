package com.tom.week03.day05;

public class StringsAgain {
  public static void main(String[] args) {
    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.
    System.out.println(removeX("XxXxXx"));
  }

  private static String removeX(String str) {
    if (str.length() == 0) {
      return "";
    }
    char firstLetter = str.charAt(0);
    if (firstLetter == 'x') {
      return removeX(str.substring(1));
    }
    return firstLetter + removeX(str.substring(1));
  }
}