package com.tom.week04.day02.comparable.domino;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino d) {
    int result = Integer.compare(left, d.left);
    if (result == 0) {
      result = Integer.compare(right, d.right);
    }
    return result;
  }
}
