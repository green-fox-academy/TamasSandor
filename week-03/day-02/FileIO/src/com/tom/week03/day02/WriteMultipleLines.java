package com.tom.week03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    manipulateFile(Paths.get("data/my-file.txt"), "apple", 5);
  }

  public static void manipulateFile(Path filePath, String word, int num) {

    List<String> content = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      content.add(word);
    }

    try {
      Files.write(filePath, content, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}