package com.tom.day05;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance in miles: ");
        double mile = input.nextDouble();
        System.out.println("The distance in kilometers is: " + mile * 1.609344);
    }
}
