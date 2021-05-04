package com.tom.week03.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt

    caesarChiper("encoded-lines.txt");
  }

  public static void caesarChiper(String fileName) {
    List<String> content = readFile(fileName);

    for (String line : content) {
      char[] result = new char[line.length()];
      for (int i = 0; i < result.length; i++) {
        if (line.charAt(i) != ' ') {
          result[i] = (char) (line.charAt(i) - 1);
        } else {
          result[i] = line.charAt(i);
        }
      }
      System.out.println(result);
    }
  }

  public static List<String> readFile(String fileName) {
    Path filePath = Paths.get("data/" + fileName);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("IO Error, couldn't read file " + filePath);
    }
    return lines;
  }
}
