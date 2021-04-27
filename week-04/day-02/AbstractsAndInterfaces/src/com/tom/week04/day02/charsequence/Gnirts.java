package com.tom.week04.day02.charsequence;

public class Gnirts implements CharSequence {
  private String str;
  private StringBuffer sb;

  public Gnirts(String str) {
    this.str = str;
    this.sb = new StringBuffer(str).reverse();
  }

  @Override
  public int length() {
    return sb.length();
  }

  @Override
  public char charAt(int index) {
    return sb.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return sb.subSequence(start, end);
  }
}
