package com.tom.datastructures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {

    Map<String, Double> shoppingList = Map.of(
        "Milk", 1.07,
        "Rice", 1.59,
        "Eggs", 3.14,
        "Cheese", 12.60,
        "Chicken Breasts", 9.40,
        "Apples", 2.31,
        "Tomato", 2.58,
        "Potato", 1.75,
        "Onion", 1.10
    );

    Map<String, Integer> bobList = Map.of(
        "Milk", 3,
        "Rice", 2,
        "Eggs", 2,
        "Cheese", 1,
        "Chicken Breasts", 4,
        "Apples", 1,
        "Tomato", 2,
        "Potato", 1
    );

    Map<String, Integer> aliceList = Map.of(
        "Rice", 1,
        "Eggs", 5,
        "Chicken Breasts", 2,
        "Apples", 1,
        "Tomato", 10
    );

    System.out.println("Bob paid: " + sum(shoppingList, bobList));
    System.out.println("Alice paid: " + sum(shoppingList, aliceList));

    System.out.println(
        aliceList.getOrDefault("Rice", 0) > bobList.getOrDefault("Rice", 0) ?
            "Alice" : "Bob" + " buys more Rice.");
    System.out.println(
        aliceList.getOrDefault("Potato", 0) > bobList.getOrDefault("Potato", 0) ?
            "Alice" : "Bob" + " buys more Potato.");

    System.out.println(aliceList.size() > bobList.size() ? "Alice" : "Bob" + " buys more products.");
  }

  public static double sum(Map<String, Double> prices, Map<String, Integer> list) {
    double sum = 0.0;
    for (Map.Entry<String, Integer> entry : list.entrySet()) {
      if (prices.containsKey(entry.getKey())) {
        sum += prices.get(entry.getKey()) * entry.getValue();
      }
    }
    return sum;
  }
}
