package com.tom.day05;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.print("Not enough");
        } else if (num == 1) {
            System.out.print("One");
        } else if (num == 2) {
            System.out.print("Two");
        } else {
            System.out.print("A lot");
        }
    }
}
