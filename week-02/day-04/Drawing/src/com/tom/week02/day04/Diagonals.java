package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void drawImage(Graphics graphics) {
    // Create a function that draws a single line
    // Use this function to draw the canvas' diagonals
    // If the line starts from the upper-left corner it should be green, otherwise it should be red
    // Make decision about the color in the function

    drawDiagonal(0, 0, WIDTH, HEIGHT, graphics);
    drawDiagonal(WIDTH, 0, 0, HEIGHT, graphics);
  }

  private static void drawDiagonal(int x, int y, int x2, int y2, Graphics g) {
    if (x == 0 && y == 0) {
      g.setColor(Color.green);
    } else {
      g.setColor(Color.red);
    }

    g.drawLine(x, y, x2, y2);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}