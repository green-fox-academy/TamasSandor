package com.tom.week04.day03;

import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) {
      throw new IllegalArgumentException();
    }
    if (str1.length() != str2.length()) {
      return false;
    }

    char[] ch1 = str1.toLowerCase().toCharArray();
    char[] ch2 = str2.toLowerCase().toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < ch1.length; i++) {
      if (ch1[i] != ch2[i]) {
        return false;
      }
    }
    return true;
  }
}
