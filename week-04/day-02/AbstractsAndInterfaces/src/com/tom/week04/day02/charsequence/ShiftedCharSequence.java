package com.tom.week04.day02.charsequence;

public class ShiftedCharSequence implements CharSequence {
  private String str;
  private int shift;

  public ShiftedCharSequence(String str, int shift) {
    this.str = str;
    this.shift = shift;
  }

  @Override
  public int length() {
    return str.length();
  }

  @Override
  public char charAt(int index) {
    // If the shifted index is longer than the String itself, go around from the beginning
    if ((index + shift) > (str.length() - 1)) {
      return str.charAt((index + shift) - (str.length() - 1));
    }
    return str.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return str.subSequence(start + shift, end + shift);
  }
}
