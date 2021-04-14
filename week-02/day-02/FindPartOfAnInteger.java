package com.tom.week02.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPartOfAnInteger {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as parameters
    //  It returns the indices of the integers of the array which contain the given number
    //  or returns an empty array (if the number is not part of any of the integers in the array)

    //  Examples:
    System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
    //  should print: `[0, 1, 4]`
    System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
    //  should print: '[]'

    // Note: We are using Arrays.toString() function to print the array returned
    // You could just as well iterate over the array and print its items one by one
  }

  public static Object[] findMatchingIndexes(int num, int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      while (arr[i] > 0) {
        if (arr[i] % 10 == num) {
          result.add(i);
          break;
        }
        arr[i] = arr[i] / 10;
      }
    }
    return result.toArray();
  }
}
