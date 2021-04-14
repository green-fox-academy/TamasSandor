package com.tom.datastructures;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>() {
      {
        put("978-1-60309-452-8", "A Letter to Jo");
        put("978-1-60309-459-7", "Lupus");
        put("978-1-60309-444-3", "Red Panda and Moon Bear");
        put("978-1-60309-461-0", "The Lab");
      }
    };

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
    }

    map.remove("978-1-60309-444-3");
    map.values().remove("The Lab");

    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");

    System.out.println(map.containsKey("478-0-61159-424-8"));
    System.out.println(map.get("978-1-60309-453-5"));
  }
}
