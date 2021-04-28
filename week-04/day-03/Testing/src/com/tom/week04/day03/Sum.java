package com.tom.week04.day03;

import java.util.ArrayList;

public class Sum {
  public int sum(ArrayList<Integer> numbers) {
    if (numbers == null) {
      throw new IllegalArgumentException();
    }

    int sum = 0;
    for (int i : numbers) {
      sum += i;
    }
    return sum;
  }
}
