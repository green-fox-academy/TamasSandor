package com.tom.week03.day03;

public class Thing {
  private String name;
  private boolean completed;

  public Thing(String name, boolean isCompleted) {
    this.name = name;
    this.completed = isCompleted;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}