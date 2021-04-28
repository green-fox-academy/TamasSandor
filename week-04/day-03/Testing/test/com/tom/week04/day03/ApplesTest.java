package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ApplesTest {

  @Test
  void testApple() {
    Apples apples = new Apples();
    assertEquals("apple", apples.getApple());
  }

  @Test
  void testCherry() {
    Apples apples = new Apples();
    assertNotEquals("cherry", apples.getApple());
  }
}