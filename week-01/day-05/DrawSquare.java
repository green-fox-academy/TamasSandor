package com.tom.day05;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.print("%");
        }
        System.out.println("");

        for (int i = 0; i < height - 2; i++) {
            System.out.print("%");
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }

        for (int i = 0; i < height; i++) {
            System.out.print("%");
        }
    }
}
