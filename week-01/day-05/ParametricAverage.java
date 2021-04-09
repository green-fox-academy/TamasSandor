package com.tom.day05;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter an integer: ");
            sum += input.nextInt();
        }

        System.out.print("Sum: " + sum + ", Average: " + sum / num);
    }
}
