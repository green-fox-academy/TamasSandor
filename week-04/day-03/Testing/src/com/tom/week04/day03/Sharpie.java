package com.tom.week04.day03;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie(String color, double width) {
    if (color == null || width == 0) {
      throw new IllegalArgumentException();
    }

    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    if (inkAmount >= 10) {
      inkAmount -= 10;
    }
  }

  public String getColor() {
    return color;
  }

  public double getWidth() {
    return width;
  }

  public double getRemainingInk() {
    return inkAmount;
  }
}