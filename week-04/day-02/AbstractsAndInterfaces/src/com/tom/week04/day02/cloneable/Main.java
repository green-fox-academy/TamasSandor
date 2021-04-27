package com.tom.week04.day02.cloneable;

public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 20, "male", "BME");

    try {
      Student johnTheClone = (Student) john.clone();
      johnTheClone.setPreviousOrganization("IBM");

      // Should print out different values because they don't share the same location in memory
      System.out
          .println(john.getPreviousOrganization() + " - " + johnTheClone.getPreviousOrganization());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
