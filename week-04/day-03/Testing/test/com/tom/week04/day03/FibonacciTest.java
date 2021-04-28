package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {
  Fibonacci fibonacci;

  @BeforeEach
  void init() {
    fibonacci = new Fibonacci();
  }

  @Test
  void testFirstIndex() {
    assertEquals(0, fibonacci.fibonacci(0));
  }

  @Test
  void testTenthIndex() {
    assertEquals(55, fibonacci.fibonacci(10));
  }

  @Test
  void testNegativeIndex() {
    assertThrows(IllegalArgumentException.class, () -> fibonacci.fibonacci(-1));
  }
}