package com.tom.week03.day03;

public class TeachersAndStudents {
  public static void main(String[] args) {
    Student s = new Student();
    Teacher t = new Teacher();

    s.question(t);
    t.teach(s);
  }
}
