package com.tom.week03.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  public static void main(String[] args) {
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - and returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, the result should be either 2006 or 2016

    System.out.println(mostCommonBirthYear("births.csv"));
  }

  public static String mostCommonBirthYear(String fileName) {
    List<String> content = readFile(fileName);
    Map<String, Integer> birthYears = new HashMap<>();

    for (String line : content) {
      String year = line.split(";")[1].split("-")[0];
      if (birthYears.containsKey(year)) {
        birthYears.put(year, birthYears.get(year) + 1);
      } else {
        birthYears.put(year, 1);
      }
    }

    Map.Entry<String, Integer> maxEntry = null;
    for (Map.Entry<String, Integer> entry: birthYears.entrySet()){
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    return maxEntry.getKey();
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
