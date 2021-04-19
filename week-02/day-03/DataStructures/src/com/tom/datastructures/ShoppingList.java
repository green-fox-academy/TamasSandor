package com.tom.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("eggs", "milk", "fish", "apples", "bread ", "chicken");

    System.out.println("Milk on the list? " + list.contains("milk"));
    System.out.println("Banana on the list? " + list.contains("banana"));
  }
}
