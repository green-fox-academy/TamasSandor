package com.tom.week03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    manipulateFile();
  }

  public static void manipulateFile() {
    Path filePath = Paths.get("data/my-file.txt");
    List<String> content = Arrays.asList("Tomi");

    try {
      Files.write(filePath, content, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.err.println("Unable to write file: my-file.txt");
    }
  }
}