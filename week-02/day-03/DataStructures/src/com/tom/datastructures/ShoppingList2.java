package com.tom.datastructures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {

    Map<String, Double> shoppingList = new HashMap<>() {
      {
        put("Milk", 1.07);
        put("Rice", 1.59);
        put("Eggs", 3.14);
        put("Cheese", 12.60);
        put("Chicken Breasts", 9.40);
        put("Apples", 2.31);
        put("Tomato", 2.58);
        put("Potato", 1.75);
        put("Onion", 1.10);
      }
    };

    Map<String, Integer> bobList = new HashMap<>() {
      {
        put("Milk", 3);
        put("Rice", 2);
        put("Eggs", 2);
        put("Cheese", 1);
        put("Chicken Breasts", 4);
        put("Apples", 1);
        put("Tomato", 2);
        put("Potato", 1);
      }
    };

    Map<String, Integer> aliceList = new HashMap<>() {
      {
        put("Rice", 1);
        put("Eggs", 5);
        put("Chicken Breasts", 2);
        put("Apples", 1);
        put("Tomato", 10);
      }
    };

    System.out.println("Bob paid: " + sum(shoppingList, bobList));
    System.out.println("Alice paid: " + sum(shoppingList, aliceList));
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
