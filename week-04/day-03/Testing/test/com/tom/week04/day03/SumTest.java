package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
  private Sum sum;

  @BeforeEach
  void init() {
    sum = new Sum();
  }

  @Test
  void testEmptyList() {
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(0, sum.sum(list));
  }

  @Test
  void testOneElement() {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1));
    assertEquals(1, sum.sum(list));
  }

  @Test
  void testSum() {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    assertEquals(6, sum.sum(list));
  }

  @Test
  void testNull() {
    assertThrows(IllegalArgumentException.class, () -> sum.sum(null));
  }
}