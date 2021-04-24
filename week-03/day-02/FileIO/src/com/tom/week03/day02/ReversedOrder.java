package com.tom.week03.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    decrypt();
  }

  private static void decrypt() {
    Path filePath = Paths.get("data/reversed-order.txt");

    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(lines.size() - 1 - i));
      }
    } catch (IOException e) {
      System.err.println("I/O error");
    }
  }
}