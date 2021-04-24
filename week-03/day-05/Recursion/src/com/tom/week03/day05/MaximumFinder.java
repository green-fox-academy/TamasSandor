package com.tom.week03.day05;

import java.util.Arrays;

public class MaximumFinder {
  public static void main(String[] args) {
    // Write a function that finds the largest element of an array using recursion.
    System.out.println(maxFinder(new int[] {1, 2, 666, 4, 5}));
  }

  private static int maxFinder(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums[0] > nums[1]) {
      nums[1] = nums[0];
    }
    return maxFinder(Arrays.copyOfRange(nums, 1, nums.length));
  }
}

