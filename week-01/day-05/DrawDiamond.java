package com.tom.day05;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int height = input.nextInt();

        for (int i = 1; i <= Math.ceil(height / 2.); i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = (int) Math.floor((height - 1) / 2.); i >= 1; i--) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i + (i - 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
