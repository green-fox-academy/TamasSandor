package com.tom.week03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.

    System.out.println(countTheLines("my-file.txt"));
  }

  public static int countTheLines(String fileName) {
    Path filePath = Paths.get("data/" + fileName);
    try {
      return Files.readAllLines(filePath, StandardCharsets.UTF_8).size();
    } catch (IOException e) {
      System.out.println("Error happened");
    }
    return 0;
  }
}
