package com.tom.week03.day03;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount -= 10;
  }

  public double getRemainingInk() {
    return inkAmount;
  }
}
