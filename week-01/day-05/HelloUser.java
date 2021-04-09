package com.tom.day05;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName);
    }
}
