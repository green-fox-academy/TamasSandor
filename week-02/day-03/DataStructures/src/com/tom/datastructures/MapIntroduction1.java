package com.tom.datastructures;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    System.out.println("Is the map empty? " + map.isEmpty());
    map.put(97, "a");
    map.put(98, "b");
    map.put(99, "c");
    map.put(65, "A");
    map.put(66, "B");
    map.put(67, "C");

    System.out.println("The keys are: " + map.keySet());
    System.out.println("The values are: " + map.values());

    map.put(68, "D");

    System.out.println("# of key-value pairs are: " + map.size());

    System.out.println("The value that is associated with key 99 is : " + map.get(99));

    map.remove(97);

    System.out.println("Is there a value with the key 100? " + map.containsKey(100));

    map.clear();
  }
}
