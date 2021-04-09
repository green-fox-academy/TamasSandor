package com.tom.day05;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of chickens: ");
        int numberOfChickens = input.nextInt();
        System.out.print("Please enter the number of pigs: ");
        int numberOfPigs = input.nextInt();

        int legs = (numberOfChickens * 2) + (numberOfPigs * 4);
        System.out.print("Number of legs are: " + legs);
    }
}
