package com.tom.week03.day03;

public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt p1 = new PostIt("orange", "blue", "Idea 1");
    PostIt p2 = new PostIt("pink", "black", "Awesome");
    PostIt p3 = new PostIt("yellow", "green", "Superb!");
  }
}
