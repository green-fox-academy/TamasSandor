package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharpieTest {
  private Sharpie sharpie;

  @BeforeEach
  void init() {
    sharpie = new Sharpie("green", 2);
  }

  @Test
  void testColor() {
    assertEquals("green", sharpie.getColor());
  }

  @Test
  void testWidth() {
    assertEquals(2, sharpie.getWidth());
  }

  @Test
  void testInkAmount() {
    sharpie.use();
    assertEquals(90, sharpie.getRemainingInk());
  }

  @Test
  void testNegativeInkAmount() {
    for (int i = 0; i < 11; i++) {
      sharpie.use();
    }
    assertEquals(0, sharpie.getRemainingInk());
  }

  @Test
  void testNullColor() {
    assertThrows(IllegalArgumentException.class, () -> new Sharpie(null, 1));
  }

  @Test
  void testZeroLengthWidth() {
    assertThrows(IllegalArgumentException.class, () -> new Sharpie("green", 0));
  }
}