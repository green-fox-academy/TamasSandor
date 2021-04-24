package com.tom.week03.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt

    decrypt();
  }

  private static void decrypt() {
    Path filePath = Paths.get("data/reversed-lines.txt");

    try {
      List<String> lines = Files.readAllLines(filePath);
      StringBuffer sb = new StringBuffer();
      for (String line : lines) {
        System.out.println(sb.delete(0, sb.length()).append(line).reverse());
      }
    } catch (IOException e) {
      System.err.println("I/O error");
    }
  }
}
