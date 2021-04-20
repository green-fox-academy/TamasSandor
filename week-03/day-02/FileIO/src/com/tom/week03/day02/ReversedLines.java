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
      for (String line : lines) {
        System.out.println(new StringBuffer(line).reverse());
      }
    } catch (IOException e) {
      System.out.println("File Error");
    }
  }
}
