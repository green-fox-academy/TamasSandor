package com.tom.week04.day03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {
  private Anagram anagram;

  @BeforeEach
  void init() {
    anagram = new Anagram();
  }

  @Test
  void testEqualStrings() {
    assertTrue(anagram.isAnagram("Dog", "Dog"));
  }

  @Test
  void testAnagramStrings() {
    assertTrue(anagram.isAnagram("Dog", "God"));
  }

  @Test
  void testFalseCase() {
    assertFalse(anagram.isAnagram("Dog", "Rod"));
  }

  @Test
  void testFirstParamNull() {
    assertThrows(IllegalArgumentException.class, () -> anagram.isAnagram(null, "God"));
  }

  @Test
  void testSecondParamNull() {
    assertThrows(IllegalArgumentException.class, () -> anagram.isAnagram("God", null));
  }
}