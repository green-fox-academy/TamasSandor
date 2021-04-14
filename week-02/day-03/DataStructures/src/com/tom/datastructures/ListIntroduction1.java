package com.tom.datastructures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    System.out.println("# of elemnts in the list: " + list.size());
    list.add("William");
    System.out.println("Is the list empty? " + list.isEmpty());
    list.add("John");
    list.add("Amanda");
    System.out.println("# of elemnts in the list: " + list.size());
    System.out.println("The 3rd element is: " + list.get(2));

    for (String name : list) {
      System.out.println(name);
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + 1 + ". " + list.get(i));
    }

    list.remove(1);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(list.size() - 1 - i));
    }
    
    list.clear();
  }
}
