package com.tom.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listA = new ArrayList<>() {
      {
        add("Apple");
        add("Avocado");
        add("Blueberries");
        add("Durian");
        add("Lychee");
      }
    };

    List<String> listB = new ArrayList<>(listA);

    System.out.println("ListA contains Durian? " + listA.contains("Durian"));

    listB.remove("Durian");

    listA.add(4, "Kiwifruit");

    System.out.println("listA size = listB size? " + (listA.size() == listB.size()));


    System.out.println("Index of Avocado in listA is: " + listA.indexOf("Avocado"));
    System.out.println("Index of Durian in listB is: " + listB.indexOf("Durian"));

    Collections.addAll(listB, "Passion Fruit", "Pomelo");

    System.out.println(listA.get(2));
  }
}
