package com.tom.day05;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner input = new Scanner(System.in);
        int guess, num = 666;

        System.out.println("Guess the number!");

        do {
            guess = input.nextInt();

            if (guess < num) {
                System.out.println("The stored number is higher");
            } else if (guess > num) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + num);
            }
        }
        while (guess != num);
    }
}
