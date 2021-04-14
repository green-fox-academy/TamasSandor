package com.tom.datastructures;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>() {
      {
        add("eggs");
        add("milk");
        add("fish");
        add("apples");
        add("bread ");
        add("chicken");
      }
    };

    System.out.println("Milk on the list? " + list.contains("milk"));
    System.out.println("Banana on the list? " + list.contains("banana"));
  }
}
