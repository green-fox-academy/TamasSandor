package com.tom.week03.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses
    // Write a function that returns the GET / POST request ratio

    List<String> logs = readLogFile();
    System.out.println(Arrays.toString(uniqueIp(logs)));
    System.out.println(ratio(logs));
  }

  public static List<String> readLogFile() {
    Path filePath = Paths.get("data/log.txt");
    try {
      return Files.readAllLines(filePath);
    } catch (IOException e) {
      System.err.println("I/O error");
    }
    return null;
  }

  public static String[] uniqueIp(List<String> list) {
    List<String> addresses = new ArrayList<>();
    for (String line : list) {
      String ipAddress = line.substring(27, 38);
      if (!addresses.contains(ipAddress)) {
        addresses.add(ipAddress);
      }
    }
    return addresses.toArray(new String[0]);
  }

  public static double ratio(List<String> list) {
    int sumGet = 0;
    int sumPost = 0;

    for (String s : list) {
      if (s.contains("GET")) {
        sumGet++;
      } else if (s.contains("POST")) {
        sumPost++;
      }
    }
    return (double) sumGet / sumPost;
  }
}
