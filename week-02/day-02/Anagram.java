package com.tom.week02.day02;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String dog = "dog";
    String god = "god";
    System.out.println(isAnagram(dog, god));
  }

  private static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    char[] ch1 = new char[str1.length()];
    char[] ch2 = new char[str2.length()];

    for (int i = 0; i < str1.length(); i++) {
      ch1[i] = str1.charAt(i);
      ch2[i] = str2.charAt(i);
    }

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < ch1.length; i++)
      if (ch1[i] != ch2[i])
        return false;

    return true;
  }
}
