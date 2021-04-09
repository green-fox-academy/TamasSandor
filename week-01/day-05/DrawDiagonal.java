package com.tom.day05;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //          i
        // %%%%%    0
        // %%  %    1   0   2
        // % % %    2   1   1
        // %  %%    3   2   0
        // %%%%%    4
        //
        // The square should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.print("%");
        }
        System.out.println("");

        for (int i = 1; i <= height - 2; i++) {
            System.out.print("%");

            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("%");

            for (int j = 0; j < (height - 2 - i); j++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }

        for (int i = 0; i < height; i++) {
            System.out.print("%");
        }
    }
}
