package com.tom.week03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another file
    // It should take two filenames (string) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows if the copy was successful

    System.out.println(copyMyFile("my-file.txt", "copid-file.txt"));
  }

  public static boolean copyMyFile(String source, String target) {
    Path sourcePath = Paths.get("data/" + source);

    try {
      List<String> lines = Files.readAllLines(sourcePath);
      Files.write(Paths.get("data/" + target), lines, StandardCharsets.UTF_8);
      return true;
    } catch (IOException e) {
      System.out.println("File Error");
    }
    return false;
  }
}
