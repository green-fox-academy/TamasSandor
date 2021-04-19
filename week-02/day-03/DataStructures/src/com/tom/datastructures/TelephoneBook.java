package com.tom.datastructures;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {
    Map<String, String> map = Map.of(
      "William A. Lathan", "405-709-1865",
      "John K. Miller", "402-247-8568",
      "Hortensia E. Foster", "606-481-6467",
      "Amanda D. Newland", "319-243-5613",
      "Brooke P. Askew", "307-687-2982"
    );

    System.out.println("John K. Miller's phone number is: " + map.get("John K. Miller"));

    for (Map.Entry<String, String> entry : map.entrySet()) {
      if (entry.getValue().equals("307-687-2982")) {
        System.out.println("Whose phone number is 307-687-2982: " + entry.getKey());
      }
    }

    System.out
        .println("Do we know Chris E. Myers' phone number? " + map.containsKey("Chris E. Myers"));
  }
}
