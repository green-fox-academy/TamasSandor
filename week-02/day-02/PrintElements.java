package com.tom.week02.day02;

public class PrintElements {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`

        int[] numbers = {4, 5, 6, 7};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
