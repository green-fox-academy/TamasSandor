package com.tom.week03.day03;

import java.util.ArrayList;

public class SharpieSet {
  private ArrayList<Sharpie> sharpieList = new ArrayList<>();

  public void add(Sharpie s) {
    sharpieList.add(s);
  }

  public int countUsable() {
    int sum = 0;
    for (Sharpie sharpie : sharpieList) {
      if (sharpie.getRemainingInk() > 0.0) {
        sum++;
      }
    }
    return sum;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).getRemainingInk() > 0.0) {
        sharpieList.remove(i);
      }
    }
  }
}