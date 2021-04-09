package com.tom.day05;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        int width = 1;
        int length = 2;
        int height = 3;

        int surface = 2 * (width * length + width * height + height * length);
        int volume = width * length * height;

        System.out.println("Surface area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
