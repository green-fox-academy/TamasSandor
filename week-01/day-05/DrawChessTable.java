package com.tom.day05;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        // Because a chess board can ONLY and ONLY be 8 by 8 there is a quite obvious answer:
        //System.out.println("% % % %");
        //System.out.println(" % % % %");
        //System.out.println("% % % %");
        //System.out.println(" % % % %");
        //System.out.println("% % % %");
        //System.out.println(" % % % %");
        //System.out.println("% % % %");
        //System.out.println(" % % % %");

        // A less obvious answer apparently also exists
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 != 0) {
                    System.out.print(j % 2 != 0 ? "%" : " ");
                } else {
                    System.out.print(j % 2 == 0 ? "%" : " ");
                }
            }
            System.out.println("");
        }
    }
}
