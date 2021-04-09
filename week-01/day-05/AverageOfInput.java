package com.tom.day05;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer #1: ");
        int i1 = input.nextInt();

        System.out.print("Enter integer #2: ");
        int i2 = input.nextInt();

        System.out.print("Enter integer #3: ");
        int i3 = input.nextInt();

        System.out.print("Enter integer #4: ");
        int i4 = input.nextInt();

        System.out.print("Enter integer #5: ");
        int i5 = input.nextInt();

        int sum = i1 + i2 + i3 + i4 + i5;
        double avg = sum / 5.0;

        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
