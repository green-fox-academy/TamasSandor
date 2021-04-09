package com.tom.day05;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        //
        // If there are less people coming than 20
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of girls: ");
        int numGirls = input.nextInt();
        System.out.print("Enter the number of boys: ");
        int numBoys = input.nextInt();

        if (numGirls == numBoys && (numGirls + numBoys) == 20) {
            System.out.print("The party is excellent!");
        } else if (((numGirls + numBoys) >= 20) && (numGirls != numBoys)) {
            System.out.print("Quite a cool party!");
        } else if (numGirls == 0) {
            System.out.print("Sausage party");
        } else if (numGirls + numBoys < 20) {
            System.out.print("Average party...");
        }
    }
}
