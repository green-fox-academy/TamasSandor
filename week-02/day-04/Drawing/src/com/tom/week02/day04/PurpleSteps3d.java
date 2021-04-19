package com.tom.week02.day04;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void drawImage(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

    graphics.setColor(Color.decode("#800080"));
    for (int i = 1; i <= 7; i++) {
      drawSquare(i * 10 + pos(i - 1), i * 10 + pos(i - 1), i * 10, graphics);
    }
  }

  private static int pos(int num) {
    int sum = 0;
    for (int i = 0; i < num; i++) {
      sum += i * 10;
    }
    return sum;
  }

  private static void drawSquare(int x, int y, int size, Graphics g) {
    g.fillRect(x, y, size, size);
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