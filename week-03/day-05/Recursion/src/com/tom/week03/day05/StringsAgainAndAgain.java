package com.tom.week03.day05;

public class StringsAgainAndAgain {
  public static void main(String[] args) {
    // Given a string,
    // compute recursively a new string where
    // all the adjacent chars are now separated by a `*`
    System.out.println(adjacentStar("spaces are characters too"));
  }

  private static String adjacentStar(String str) {
    if (str.length() == 0) {
      return "";
    }
    return str.charAt(0) + "*" + adjacentStar(str.substring(1));
  }
}
